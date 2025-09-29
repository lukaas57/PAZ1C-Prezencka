package sk.upjs.paz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

public record Prezencka(
        Long id,
        Predmet predmet,
        LocalDateTime datum,
        Set<Student> zoznamStudentov){
}
