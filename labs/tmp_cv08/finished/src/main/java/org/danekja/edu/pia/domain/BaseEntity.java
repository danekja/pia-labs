package org.danekja.edu.pia.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * Base interface for all entities to make implementation of generic dao easier.
 *
 * PK type represents type of the entity's primary key.
 *
 * Date: 26.9.15
 *
 * @author Jakub Danek
 */
@MappedSuperclass
public abstract class BaseEntity implements  IEntity<Long> {

    protected Long id;

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.TABLE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    @Transient
    public Long getPK() {
        return getId();
    }

    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract int hashCode();
}
