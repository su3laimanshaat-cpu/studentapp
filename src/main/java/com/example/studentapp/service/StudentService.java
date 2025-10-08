package com.example.studentapp.service;

import com.example.studentapp.model.Student;
import com.example.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Student create(Student s) {
        s.setId(null);
        return repository.save(s);
    }

    public Student update(Long id, Student update) {
        return repository.findById(id)
                .map(existing -> {
                    existing.setName(update.getName());
                    existing.setMajor(update.getMajor());
                    existing.setGrade(update.getGrade());
                    return repository.save(existing);
                })
                .orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
