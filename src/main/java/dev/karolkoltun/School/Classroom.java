package dev.karolkoltun.School;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();


    void addStudent(Student student){
        studentList.add(student);

    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
}
