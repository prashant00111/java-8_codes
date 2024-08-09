package com.java.intervew.stream.dec;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraysDemo {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Rajesh","Kamlesh","Suresh");
        List<String> list2 = Arrays.asList("Suresh","Mahesh","Bhupesh");
        List<List<String>> list3 = Arrays.asList(list1,list2);
        list3.stream().flatMap(Collection::stream).distinct().toList().forEach(System.out::println);
    }
}
