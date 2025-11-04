package com.korit.study.gpt.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
    Student student = new Student();
    //이름 부분 검색
    public List<Student> findByNameContains(String keyword) {
        if (keyword == null || keyword == " ") {
            throw new IllegalArgumentException();
        }
        List<Student> result = new ArrayList<>();
        if (student.name.contains(keyword)) {
            result.add(student);
        }
        return result;
    }


}
