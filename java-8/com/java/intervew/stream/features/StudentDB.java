package com.java.intervew.stream.features;

import java.util.Arrays;
import java.util.List;

public class StudentDB {
    public static List<Students> getStudent(){
        List<Students> studentsList = Arrays.asList(
                new Students(101,"Raju","EC"),
                new Students(105,"Mahesh","ME"),
                new Students(103,"Rajesh","EE"),
                new Students(109,"Kaju","IT"),
                new Students(111,"Pankaj","CS")
        );
        return studentsList;
    }
}
