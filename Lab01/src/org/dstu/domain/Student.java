package org.dstu.domain;

public class Student extends Person {
    private int course = 1;
    private String group;
    private String speciality;

    public Student() {
    }

    public Student(String[] data) {
        super(data[1], data[2], data[3]);
        this.group = data[4];
        this.course = Integer.parseInt(data[5]);
        this.speciality = data[6];
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "course=" + course +
                ", group='" + group + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
