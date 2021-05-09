package fr.jufab.application.database;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

/**
 * @author jufab
 * @version 1.0
 */
@Entity
public class Person extends PanacheEntity {
    public String firstName;
    public String lastName;
}
