package org.dstu.domain;

public class TempModel {
    private String name;
    private String manufacturer ;
    private String year_of_manufacture ;
    private String crew_size  ;

    public TempModel() {

    }

    public TempModel(String name, String manufacturer, String year_of_manufacture, String crew_size) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year_of_manufacture = year_of_manufacture;
        this.crew_size = crew_size;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(String year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public String getCrew_size() {
        return crew_size;
    }

    public void setCrew_size(String crew_size) {
        this.crew_size = crew_size;
    }

    @Override
    public String toString() {
        return "TempModel{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year_of_manufacture='" + year_of_manufacture + '\'' +
                ", crew_size='" + crew_size + '\'' +
                '}';
    }
}
