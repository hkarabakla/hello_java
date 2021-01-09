package com.hkarabakla.jpa.oto.pkfk;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @Column(name = "student_id")
    private int id;

    private String city;

    private String street;

    private String houseNumber;

    @OneToOne
    @MapsId
    @JoinColumn(name = "student_id")
    private Student student;
}
