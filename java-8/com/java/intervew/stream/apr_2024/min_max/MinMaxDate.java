package com.java.intervew.stream.apr_2024.min_max;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxDate {
    public static void main(String[] args) {
        List<LocalDate> localDates = Arrays.asList(
                LocalDate.now(),
                LocalDate.now().plusDays(5),
                LocalDate.now().minusDays(4),
                LocalDate.now().plusMonths(1),
                LocalDate.now().minusMonths(1)
        );
        Optional<LocalDate> minDate = localDates.stream().min(Comparator.comparing(LocalDate::toEpochDay));
        minDate.ifPresent(
                date -> System.out.println("1. The Minimum LocalDate is = "
                        + date));
        //LocalDate minDates = localDates.stream().min(Comparator.comparing(LocalDate::toEpochDay)).get();
        //System.out.println(minDates);
        System.out.println("-".repeat(40));
        Optional<LocalDate> maxDate = localDates.stream().max(Comparator.comparing(LocalDate::toEpochDay));
        maxDate.ifPresent(
                date -> System.out.println("1. The Minimum LocalDate is = "
                        + date));

       // LocalDate maxDates = localDates.stream().max(Comparator.comparing(LocalDate::toEpochDay)).get();
        //System.out.println(maxDates);
    }
}
