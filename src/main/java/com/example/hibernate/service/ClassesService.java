package com.example.hibernate.service;

import com.example.hibernate.model.Classes;
import com.example.hibernate.repository.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    private ClassesRepository classesRepository;

    public List<Classes> getAllClasses() {
        return classesRepository.findAll();
    }

    public Classes getClassById(Long id) {
        return classesRepository.findById(id).orElse(null);
    }

    public Classes createClass(Classes clazz) {
        return classesRepository.save(clazz);
    }

    public void deleteClass(Long id) {
        classesRepository.deleteById(id);
    }
}
