package dev.karolkoltun.School;

public class Teacher {

    private String teacherName;
    private String teacherSurname;
    private float heightTeacher;
    private String teacherSpecialization;

    public Teacher(String teacherName, String teacherSurname, float heightTeacher, String teacherSpecialization) {
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.heightTeacher = heightTeacher;
        this.teacherSpecialization = teacherSpecialization;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public float getHeightTeacher() {
        return heightTeacher;
    }

    public void setHeightTeacher(float heightTeacher) {
        this.heightTeacher = heightTeacher;
    }

    public String getTeacherSpecialisation() {
        return teacherSpecialization;
    }

    public void setTeacherSpecialisation(String teacherSpecialisation) {
        this.teacherSpecialization = teacherSpecialisation;
    }
}
