package com.hkarabakla.jpa.mtm;

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

    @ManyToMany
    @JoinTable(
            name = "student_lessons",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id"))
    private Set<Lesson> registeredLessons;

    private boolean deleted = false;
}
