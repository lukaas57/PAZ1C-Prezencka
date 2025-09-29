package sk.upjs.paz;

import java.util.Set;

public class StudentService {

    public StudentService(Set<Student> students) {
        this.students = students;
    }

    private Set<Student> students;

    public PomerGenderov pomer(){
        int pocetMan = 0;
        int pocetWoman = 0;
        int pocetMotant = 0;

        for (Student s: students){
            if (s.sex() == Student.Gender.Man){
                pocetMan++;
            }
            if (s.sex() == Student.Gender.Woman){
                pocetWoman++;
            }

            if (s.sex() == Student.Gender.Motant){
                pocetMotant++;
            }
        }

        return new PomerGenderov(pocetMan, pocetWoman, pocetMotant);
    }
}
