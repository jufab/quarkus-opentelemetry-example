package fr.jufab.application.api;

import fr.jufab.application.database.Person;
import java.util.List;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author jufab
 * @version 1.0
 */
@Path("/persons")
public class PersonResource {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Person> getPersons() {
    return Person.listAll();
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Person getPersonById(@PathParam("id") long id) {
    return Person.findById(id);
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  @Transactional
  public Person savePerson(Person person) {
    person.persist();
    return person;
  }
}
