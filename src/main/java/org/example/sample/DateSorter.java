package org.example.sample;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class DateSorter {
  public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
    unsortedDates.sort(Comparator.comparing(LocalDate::getMonthValue)
            .thenComparing(LocalDate::getMonth, Comparator.comparing(m -> m.toString().contains("r")))
            .reversed());

    return unsortedDates;
  }
}
