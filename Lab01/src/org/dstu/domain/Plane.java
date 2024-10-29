package org.dstu.domain;

public class Plane extends TempModel implements IProduction {
    private String engineType;
    private Float wingspan ;

    public Plane() {
    }

    public Plane(String[] data) {
        super(data[1], data[2], data[3],data[4]);
        this.engineType = data[5];
        this.wingspan  = Float.parseFloat(data[6]);
    }


    public String getGroup() {
        return engineType;
    }

    public void setGroup(String group) {
        this.engineType = group;
    }

    public Float getSpeciality() {
        return wingspan ;
    }

    public void setSpeciality(Float speciality) {
        this.wingspan  = speciality;
    }

    @Override
    public String toString() {
        return super.toString() + "Plane{" +
                ", engineType='" + engineType + '\'' +
                ", wingspan='" + wingspan + '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        IProduction.super.printInfo();
    }
}
