package com.example.bus_tracking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;



@Entity
public class BusLocation {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id; // Change the type to Long
    private double latitude;
    private double longitude;
    private String routeId;
    private String busId;

    // Getters and Setters


    @Override
    public String toString() {
        return "BusLocation{" +
                "latitude=" + latitude +
                ", id=" + id +
                ", longitude=" + longitude +
                ", routeId='" + routeId + '\'' +
                ", busId='" + busId + '\'' +
                '}';
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }
}