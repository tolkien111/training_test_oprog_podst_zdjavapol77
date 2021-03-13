package dev.karolkoltun.School;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
//Cwiczenie 5.1/str.117 z prezentacji

class ClassroomTest {
    @Test
    void  shouldSetTeacher(){
        //Given
        Classroom classroom = new Classroom();
        Teacher teacher = new Teacher("A", "B", 180, "math");

        //When
        classroom.setTeacher(teacher);

        //Then      //dokończyć
    }
    @Test
    void shouldAddNewStudent(){
        //Given
        Classroom classroom = new Classroom();
        Student student01 = new Student("Adam", "Kowalski", LocalDate.of(1986, 05, 21));

        //When
        classroom.addStudent(student01);

        //Then
        List<Student> result = classroom.getStudentList();
        assertThat(result)
                .containsExactly(student01);


    }

}