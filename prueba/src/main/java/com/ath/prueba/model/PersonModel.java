package com.ath.prueba.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "person")
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty(message = "{person.empty.name}")
    private String name;

    @NotNull
    @NotEmpty(message = "{person.empty.last.name}")
    private String lastName;

    @NotNull
    @Min(0)
    @Max(130)
    private Integer age;

    @NotNull
    private Long phoneNumber;

    @NotEmpty(message = "{person.empty.email}")
    @Email(message = "{person.bad.email}")
    private String email;

    public PersonModel() {

    }

    public PersonModel(@NotNull @NotEmpty(message = "Please provide a name") String name,
                       @NotNull @NotEmpty(message = "Please provide a lastName") String lastName,
                       @NotNull @Min(0) Integer age, @NotNull Long phoneNumber,
                       @NotEmpty(message = "Please provide an email") @Email(message = "{person.bad.email}") String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
