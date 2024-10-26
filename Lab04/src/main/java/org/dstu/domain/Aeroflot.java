package org.dstu.domain;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.LinkedHashSet;

import java.util.Set;

public class Aeroflot {
    private int id;
    private String departurePoint;
    private Integer flightNumber;
    private String departureDate;
    private String departureTime;
    private String destinationCity;
    private String typeOfAircraft;
    private Integer numberOfPassengers;
    private Integer availableSeats;
    private Set<Plane> staff = new LinkedHashSet<>();

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "departurePoint")
    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    @Basic
    @Column(name = "flightNumber")
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Basic
    @Column(name = "departureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @Basic
    @Column(name = "departureTime")
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Basic
    @Column(name = "destinationCity")
    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    @Basic
    @Column(name = "typeOfAircraft")
    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    @Basic
    @Column(name = "numberOfPassengers")
    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Basic
    @Column(name = "availableSeats")
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @OneToMany(mappedBy = "aeroflot")
    public Set<Plane> getStaff() {
        return staff;
    }

    public void setChair(Set<Plane> staff) {
        this.staff = staff;
    }
}

