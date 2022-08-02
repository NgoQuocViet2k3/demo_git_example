package com.codegym;

public class Student {
    private int id;
    private String name;
    private String birthday;
    private String citizenIdentification;

    public Student() {
    }

    public Student(int id, String name, String birthday, String citizenIdentification) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.citizenIdentification = citizenIdentification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", citizenIdentification='" + citizenIdentification + '\'' +
                '}';
    }
}
