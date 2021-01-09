package com.hkarabakla.jpa.oto.foreign;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;

    private String city;

    private String street;

    private String houseNumber;

    @OneToOne(mappedBy = "address")
    private Student student;
}
