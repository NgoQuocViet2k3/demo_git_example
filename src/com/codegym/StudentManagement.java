package com.codegym;



import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private static List<Student> studentList = new ArrayList<>();


    public static void displayListStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void addStudent(Student student) {
        studentList.add(student);
    }

    public int size() {
        return studentList.size();
    }

    public static Student findStudentByName(String name) {
        Student student = null;
        for (int index = 0; index < studentList.size(); index++) {
            if (studentList.get(index).getName().equals(name)){
                student = studentList.get(index);
            }
        }
        return student;
    }
}
