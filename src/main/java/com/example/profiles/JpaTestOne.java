package com.example.profiles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "profile_test")
public class JpaTestOne {

    @Id
    @Column(name = "id")
    public String id;

    @Column(name = "name")
    public String name;

    public JpaTestOne() {}

    public JpaTestOne(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = "Mary One";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
