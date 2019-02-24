package com.sofiqul54.serviceimpl;

import com.sofiqul54.entity.Student;
import com.sofiqul54.repository.StudentRepository;
import com.sofiqul54.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public void saveOrUpdate(Student student) {
        repository.save(student);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        return repository.getOne(id);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }
}
