package com.example.demo.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,Long>{

    List<Course> findByName(String lastName);

    Course findById(long id);
}
