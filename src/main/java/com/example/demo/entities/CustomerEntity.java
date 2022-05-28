package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen")
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "email", columnDefinition = "varchar(60)", nullable = false)
    private String email;

    @Column(name = "first_name", columnDefinition = "varchar(60)", nullable = false)
    private String first_name;

    @Column(name = "last_name", columnDefinition = "varchar(60)", nullable = false)
    private String last_name;

    @Column(name = "country", columnDefinition = "varchar(60)", nullable = false)
    private String country;

    public CustomerEntity() {
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
