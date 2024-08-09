package com.java.intervew.stream.features;

import java.util.List;

public class StudentManager {

        private static List<Students> studentDB = StudentDB.getStudent();

        // Method to add a student
        public static void addStudent(String studentName) {
         List<String> names = studentDB.stream().filter(n -> n.getName().equals(studentName)).map(Students::getName).toList();
         System.out.println(names);
         if(names.stream().anyMatch(n-> n.equals(studentName))){
             throw new IllegalArgumentException("Student with the "+ studentName +" name already exists!");
         }else {
            names.add("Alice");
             System.out.println("Student " + studentName + " has been added.");
         }

        }

        public static void main(String[] args) {
           //addStudent("Prashant");
            try {
                addStudent("Pankaj");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            // Example: Adding a new student
            addStudent("Alice");

        }
}
