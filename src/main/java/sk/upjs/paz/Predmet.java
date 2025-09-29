package sk.upjs.paz;

import lombok.With;

import java.util.Set;

@With
public record Predmet(
        Long ID,
        String name,
        int YearOfStudies,
        Set<Student> students){

}
