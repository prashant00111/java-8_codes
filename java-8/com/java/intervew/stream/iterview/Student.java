package com.java.intervew.stream.iterview;



public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double marks;

    private String department;
    public Student(int id, String name, double marks, String department) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.department = department;
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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Student o) {
        return (this.id - o.id);
    }
}
