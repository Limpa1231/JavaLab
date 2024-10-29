package org.dstu.domain;

public class Ship extends TempModel implements IProduction {
    private String draft;
    private String cargo_capacity ;


    public Ship() {
    }

    public Ship(String[] data) {
        super(data[1], data[2], data[3],data[4]);
        this.draft = data[5];
        this.cargo_capacity = data[6];
    }

    public String getDegree() {
        return draft;
    }

    public void setDegree(String degree) {
        this.draft = degree;
    }

    public String getChair() {
        return cargo_capacity;
    }

    public void setChair(String chair) {
        this.cargo_capacity = chair;
    }

    @Override
    public String toString() {
        return super.toString() + "Ship{" +
                "draft='" + draft + '\'' +
                ", cargo_capacity='" + cargo_capacity + '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        IProduction.super.printInfo();
    }
}
