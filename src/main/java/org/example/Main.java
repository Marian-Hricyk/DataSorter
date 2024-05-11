package org.example;

import org.example.sample.DateSorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<LocalDate> unsortedDates = new ArrayList<>();
    unsortedDates.add(LocalDate.of(2004, 7, 1)); // Липень (без "r")
    unsortedDates.add(LocalDate.of(2005, 1, 2)); // Січень ("r")
    unsortedDates.add(LocalDate.of(2007, 1, 1)); // Січень ("r")
    unsortedDates.add(LocalDate.of(2032, 5, 3)); // Травень (без "r")

    DateSorter sorter = new DateSorter();
    List<LocalDate> sortedDates = new ArrayList<>(sorter.sortDates(unsortedDates));

    // Виведення відсортованих дат
    for (LocalDate date : sortedDates) {
      System.out.println(date);
    }
  }
}