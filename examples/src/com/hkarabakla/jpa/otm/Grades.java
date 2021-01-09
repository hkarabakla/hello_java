package com.hkarabakla.jpa.otm;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Grades {

    @Id
    @Column(name = "student_id")
    private int id;

    private String lessonName;

    @Temporal(TemporalType.DATE)
    private LocalDate creationDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
