package com.hkarabakla.jpa.mtm;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Lesson {

    @Id
    @Column(name = "student_id")
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private LocalDate registrationDate;

    @ManyToMany(mappedBy = "registeredLessons")
    private Set<Student> students;
}
