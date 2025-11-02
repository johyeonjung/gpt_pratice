package com.korit.study.gpt.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {
    private static InMemoryStudentRepository instance = new InMemoryStudentRepository();
    Map<String, Student> students = new HashMap<>();
    private InMemoryStudentRepository() {

    }

    @Override
    public void save(Student student) {
            students.put(student.id, student);
    }

    @Override
    public Student findById(String id) {
        return students.get(id);
    }

    @Override
    public List<Student> findAll() {
        return students;

    }

    @Override
    public void delete(String id) {
        students.remove(id);

    }

    @Override
    public void existsById(String id) {
        if(students.containsKey(id)) {
            System.out.println("존재함");
        } else {
            System.out.println("존재하지 않음");
        }
    }
}
