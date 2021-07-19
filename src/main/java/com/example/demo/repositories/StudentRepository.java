package com.example.demo.repositories;

import com.example.demo.models.Major;
import com.example.demo.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    List<Student> findByMajor(Major major);
}

