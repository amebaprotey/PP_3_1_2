package com.example.PP_312.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    @Column(name = "name")
    @NotEmpty(message = "Поле \"name\" не может быть пустым")
    @Pattern(regexp = "([a-zA-Zа-яА-я])*",message = "Введены не валидные символы")
    String name;
    @Column(name = "surname")
    @NotEmpty(message = "Поле \"surname\" фамилия не может быть пустым")
    @Pattern(regexp = "([a-zA-Zа-яА-я])*", message = "Введены не валидные символы")
    String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
