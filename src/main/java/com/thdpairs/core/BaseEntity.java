package com.thdpairs.core;

/*
 * Created by destruktobot on 1/14/17.
 */

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long Id;

    public Long getId() {
        return Id;
    }

    protected BaseEntity() {
        Id = null;
    }
}
