package com.example.demo.services;

import com.example.demo.models.Major;
import com.example.demo.models.Student;

import java.util.List;

public interface StudentService {

    void register(Student student);

    void expel(Student student);

    void expel(int id);

    Student findStudent(int id);

    List<Student> findByMajor(Major major);
}

