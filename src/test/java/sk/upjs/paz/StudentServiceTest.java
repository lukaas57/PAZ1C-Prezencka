package sk.upjs.paz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testPomer() {
        Set<Student> testStudents = Set.of(
                new Student(1L, "Ivan", "Mede", Student.Gender.Man, LocalDate.now()),
                new Student(2L, "Larisa", "Filasova", Student.Gender.Woman, LocalDate.now()),
                new Student(3L, "Shrek", "Swamp", Student.Gender.Motant, LocalDate.now()));

        var studentService = new StudentService(testStudents);
        var vysledok = studentService.pomer();

        var  spravnyVysledok = new PomerGenderov(1,1,1);

        assertEquals(spravnyVysledok, vysledok);

        var spravnyPomerChlapcov = (double) 1/ (double) 3;
        assertEquals(spravnyPomerChlapcov, vysledok.pomerChlapcov());

        var spravnyPomerDievcat = (double) 1/ (double) 3;
        assertEquals(spravnyPomerDievcat, vysledok.pomerDievcat());


    }

}