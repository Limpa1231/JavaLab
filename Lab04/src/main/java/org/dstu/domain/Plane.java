package org.dstu.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.text.DateFormat;
import java.util.Objects;

public class Plane {
    private int id;
    private String model;
    private String manufacturer ;
    private String yearOfManufacture ;
    private String status ;
    private String lastMaintenanceDate;
    private Aeroflot aeroflot;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public void setAeroflot(Aeroflot aeroflot) {
        this.aeroflot = aeroflot;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aeroflot")
    public Aeroflot getAeroflot() {
        return aeroflot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return id == plane.id && Objects.equals(model, plane.model) && Objects.equals(manufacturer, plane.manufacturer) && Objects.equals(yearOfManufacture, plane.yearOfManufacture) && Objects.equals(status, plane.status) && Objects.equals(lastMaintenanceDate, plane.lastMaintenanceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, manufacturer, yearOfManufacture, status, lastMaintenanceDate);
    }
}
