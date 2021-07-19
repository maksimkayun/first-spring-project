package com.example.demo.repositories;

import com.example.demo.models.Major;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorRepository extends CrudRepository<Major, Integer> {
}

