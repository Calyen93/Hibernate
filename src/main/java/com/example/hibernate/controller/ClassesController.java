package com.example.hibernate.controller;

import com.example.hibernate.model.Classes;
import com.example.hibernate.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @GetMapping
    public List<Classes> getAllClasses() {
        return classesService.getAllClasses();
    }

    @GetMapping("/{id}")
    public Classes getClassById(@PathVariable Long id) {
        return classesService.getClassById(id);
    }

    @PostMapping
    public Classes createClass(@RequestBody Classes clazz) {
        return classesService.createClass(clazz);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classesService.deleteClass(id);
    }
}
