package vn.codegym.airbnb.dto;

import java.time.LocalDate;

public class BookingDetail {

    private int badRooms;
    private int bathRooms;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String name;
    private double total;
    private String content;

    public BookingDetail( int badRooms, int bathRooms, LocalDate checkIn, LocalDate checkOut, String name, double total, String content) {
        this.badRooms = badRooms;
        this.bathRooms = bathRooms;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.name = name;
        this.total = total;
        this.content = content;
    }

    public int getBadRooms() {
        return badRooms;
    }

    public void setBadRooms(int badRooms) {
        this.badRooms = badRooms;
    }

    public int getBathRooms() {
        return bathRooms;
    }

    public void setBathRooms(int bathRooms) {
        this.bathRooms = bathRooms;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


