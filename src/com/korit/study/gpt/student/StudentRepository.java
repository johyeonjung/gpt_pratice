package com.korit.study.gpt.student;


import java.util.List;

public interface StudentRepository {
    void save(Student student);
    String findById(String id);
    List<Student> findAll();
    void delete(String id);
    boolean existsById(String id);


}