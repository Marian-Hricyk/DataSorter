package org.example.sample;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class DateSorter {
  public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
    return unsortedDates.stream()
            .sorted(Comparator.comparing((LocalDate d) -> !d.getMonth().name().toLowerCase().contains("r"))
                    .thenComparing(LocalDate::compareTo))
            .collect(Collectors.toList());
  }
}
