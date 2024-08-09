package com.java.intervew.stream.apr_2024.map_and_flatmap;

public class Students {
    private int rollNo;
    private String name;
    private double percentage;
    private String dep;

    public Students(int rollNo, String name, double percentage, String dep) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        this.dep = dep;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", dep='" + dep + '\'' +
                '}';
    }
}
