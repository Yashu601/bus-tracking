package com.example.bus_tracking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double currentSpeed;
    private String nextStop;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")

    private Date originDate;
    private Date estimateArrival;
    private int delay;
    private Date lastUpdate;

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", currentSpeed=" + currentSpeed +
                ", nextStop='" + nextStop + '\'' +
                ", originDate=" + originDate +
                ", estimateArrival=" + estimateArrival +
                ", delay=" + delay +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getNextStop() {
        return nextStop;
    }

    public void setNextStop(String nextStop) {
        this.nextStop = nextStop;
    }

    public Date getOriginDate() {
        return originDate;
    }

    public void setOriginDate(Date originDate) {
        this.originDate = originDate;
    }

    public Date getEstimateArrival() {
        return estimateArrival;
    }

    public void setEstimateArrival(Date estimateArrival) {
        this.estimateArrival = estimateArrival;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
