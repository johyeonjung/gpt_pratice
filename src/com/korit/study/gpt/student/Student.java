package com.korit.study.gpt.student;

import java.util.List;
import java.util.Objects;


public class Student extends Person{
    int grade;
    List<String> SubjectList;

    @Override
    public void describe() {
        System.out.println(grade + "학년"+ name + "입니다");
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    boolean validate(Student s) {
        if(s.name.contains(" ") || s.name.matches(".*[^A-Za-z0-9].*")) {
            throw new IllegalStateException();
        }
        else if(!(s.grade <=4 && s.grade >= 1)) {
            throw new IllegalStateException();
        } else {
            return true;
        }
    }
}
