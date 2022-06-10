package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    protected Course() {
    }

    public Course(String name, LocalDate dateStart, LocalDate dateEnd) {
        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }


    public String getName() {
        return name;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && Objects.equals(name, course.name) && Objects.equals(dateStart, course.dateStart) && Objects.equals(dateEnd, course.dateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateStart, dateEnd);
    }
}
