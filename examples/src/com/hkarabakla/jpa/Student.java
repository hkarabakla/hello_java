package com.hkarabakla.jpa;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "student")
@Table(name = "students", schema = "schema_1")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, length = 100, unique = false)
    private String name;

    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;

    @Transient
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private boolean deleted = false;
}
