package org.example;

import org.example.sample.DateSorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<LocalDate> unsortedDates = new ArrayList<>();
    unsortedDates.add(LocalDate.of(2004, 7, 1));
    unsortedDates.add(LocalDate.of(2005, 1, 2));
    unsortedDates.add(LocalDate.of(2007, 1, 1));
    unsortedDates.add(LocalDate.of(2032, 5, 3));

    DateSorter sorter = new DateSorter();
    List<LocalDate> sortedDates = new ArrayList<>(sorter.sortDates(unsortedDates));


    for (LocalDate date : sortedDates) {
      System.out.println(date);
    }
  }
}