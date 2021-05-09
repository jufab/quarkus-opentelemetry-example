package fr.jufab.application.config;

import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * @author jufab
 * @version 1.0
 */
@ConfigProperties(prefix = "otel.exporter")
public interface OtlpGrpcSpanExporterConfiguration {
  @ConfigProperty(defaultValue = "http://localhost:4317")
  String endpoint();
}
