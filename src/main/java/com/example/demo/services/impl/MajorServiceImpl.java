package com.example.demo.services.impl;

import com.example.demo.models.Major;
import com.example.demo.repositories.MajorRepository;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.services.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    private MajorRepository majorRepository;

    @Override
    public void register(Major major) {
        majorRepository.save(major);
    }

    @Override
    public Major findMajor(int id) {
        return majorRepository.findById(id).get();
    }
}
