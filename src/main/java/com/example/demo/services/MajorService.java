package com.example.demo.services;

import com.example.demo.models.Major;
import com.example.demo.models.Student;

public interface MajorService {
    void register(Major major);
    Major findMajor(int id);
}
