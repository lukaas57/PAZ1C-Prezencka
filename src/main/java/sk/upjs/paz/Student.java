package sk.upjs.paz;

import lombok.With;

import java.time.LocalDate;
import java.util.Date;

@With
public record Student(
    String meno,
    String priezvisko,
    Gender sex,
    Long id,
    LocalDate datumNarodenia){
    
    public enum Gender{
        Man, Woman, Motant;
    }
}
