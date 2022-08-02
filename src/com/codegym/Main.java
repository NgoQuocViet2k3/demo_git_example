package com.codegym;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static StudentManagement studentManagement = new StudentManagement();

    public static void main(String[] args) {
        menuBai4_1();
    }

    public static void menuBai4_1() {
        int choice = -1;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            System.out.println("1.Hiển thị danh sách học sinh: ");
            System.out.println("2.Thêm học sinh: ");
            System.out.println("3.Tìm kiếm học sinh: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showAllStudent(studentManagement);
                    break;
                case 2:
                    showCreateStudent(studentManagement);
                    break;
                case 3:
                    showFindStudent(studentManagement);
                    break;
            }
        } while (choice != 0);
    }


    public static void showCreateStudent(StudentManagement studentManagement) {
        System.out.println("Điền thông tin học sinh: ");
        System.out.println("Mã học sinh: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Ngày sinh: ");
        String birthday = scanner.nextLine();
        System.out.println("Căn cước công dân: ");
        String citizenIdentification = scanner.nextLine();
        Student student = new Student(id, name, birthday, citizenIdentification);
        studentManagement.addStudent(student);
    }

    public static void showAllStudent(StudentManagement studentManagement) {
        int size = studentManagement.size();
        if (size == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách khách sạn");
            studentManagement.displayListStudent();
        }
    }

    public static void showFindStudent(StudentManagement studentManagement) {
        scanner.nextLine();
        System.out.println("Nhập tên học sinh cần tìm: ");
        String name = scanner.nextLine();
        if (studentManagement.findStudentByName(name) != null) {
            System.out.println(studentManagement.findStudentByName(name));
        } else {
            System.out.println(name + " không tìm thấy trong danh sách học sinh");
        }
    }
    public static List<Classmate> inputManyClassmate() {
        List<Classmate> listClassmate = new ArrayList<>();
        System.out.println("Nhập số lượng thông tin bạn cùng lớp cần nhập: ");
        int size = scanner.nextInt();
        for (int index = 0; index < size; index++) {
            System.out.println("Nhập thông tin bạn thứ " + (index + 1) + ": ");
            System.out.println("Nhập tên của bạn: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String birthday = scanner.nextLine();
            System.out.println("Nhập địa chỉ email: ");
            String email = scanner.nextLine();
            Classmate classmate = new Classmate(name, birthday, email);
            listClassmate.add(classmate);
            System.out.println(classmate);
            try {
                FileWriter fileWriter = new FileWriter("classmate.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(listClassmate.get(index).toString() + "\n");
                fileWriter.write(String.valueOf(classmate));
                fileWriter.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Ghi file thành công");
        }
        return listClassmate;
    }
}

