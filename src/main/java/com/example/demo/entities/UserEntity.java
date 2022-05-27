package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seg_gen")
    @Column(name = "id")
    private Integer id;

    @Column(name = "matricula", columnDefinition = "varchar(20)", nullable = false)
    private String matricula;

    @Column(name = "first_name", columnDefinition = "varchar(60)", nullable = false)
    private String first_name;

    @Column(name = "last_name", columnDefinition = "varchar(60)", nullable = false)
    private String last_name;

    public UserEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
}
