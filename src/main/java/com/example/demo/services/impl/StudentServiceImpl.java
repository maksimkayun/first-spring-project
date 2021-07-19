package com.example.demo.services.impl;

import com.example.demo.models.Major;
import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void register(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void expel(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public void expel(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> findByMajor(Major major) {
        return studentRepository.findByMajor(major);
    }
}

