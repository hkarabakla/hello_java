package com.hkarabakla.jpa.otm;

import com.hkarabakla.jpa.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

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

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Grades> grades;

    private boolean deleted = false;
}
