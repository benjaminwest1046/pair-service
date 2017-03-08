package com.thdpairs.developer;

import com.thdpairs.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by ben on 1/14/17.
 */

@Entity
public class Developer extends BaseEntity{
    private String name;

   protected Developer() {
        super();
    }

    public Developer(String name) {
       this();
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
