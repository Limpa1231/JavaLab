package org.dstu.domain;

public class Teacher extends Person {
    private String degree;
    private String chair;

    private int experience;

    public Teacher() {
    }

    public Teacher(String[] data) {
        super(data[1], data[2], data[3]);
        this.chair = data[4];
        this.degree = data[5];
        this.experience = Integer.parseInt(data[6]);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "degree='" + degree + '\'' +
                ", chair='" + chair + '\'' +
                ", exp='" + experience + '\'' +
                '}';
    }
}
