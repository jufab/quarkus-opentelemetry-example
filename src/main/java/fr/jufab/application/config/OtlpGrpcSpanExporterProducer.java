package fr.jufab.application.config;

import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author jufab
 * @version 1.0
 */
@Singleton
public class OtlpGrpcSpanExporterProducer {
  OtlpGrpcSpanExporterConfiguration otlpGrpcSpanExporterConfiguration;

  @Inject
  public OtlpGrpcSpanExporterProducer(
      OtlpGrpcSpanExporterConfiguration otlpGrpcSpanExporterConfiguration) {
    this.otlpGrpcSpanExporterConfiguration = otlpGrpcSpanExporterConfiguration;
  }

  @Produces
  @Singleton
  public SpanExporter buildSpanExporter() {
    return OtlpGrpcSpanExporter.builder()
        .setEndpoint(this.otlpGrpcSpanExporterConfiguration.endpoint())
        .build();
  }
}
