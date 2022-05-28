package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "email", columnDefinition = "varchar(60)", nullable = false)
    private String email;

    @Column(name = "name", columnDefinition = "varchar(60)", nullable = false)
    private String name;

    @Column(name = "country", columnDefinition = "varchar(60)", nullable = false)
    private String country;

    public SupplierEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
