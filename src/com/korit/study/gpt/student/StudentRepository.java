package com.korit.study.gpt.student;


public interface StudentRepository {
    void save(Student student);
    String findById(String id);
    List<Student> findAll();
    void delete(String id);
    boolean existsById(String id);


}