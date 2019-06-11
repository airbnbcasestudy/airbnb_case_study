package vn.codegym.airbnb.model;

import java.sql.Date;
import java.time.LocalDate;

public class Booking {
    private int id;
    private int propertiesId;
    private int userId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private LocalDate cancelDate;
    private LocalDate bookingDate;
    private double amountPaid;

    public Booking() {
    }

    public Booking(int propertiesId, int userId, LocalDate checkIn, LocalDate checkOut,
                   LocalDate cancelDate, LocalDate bookingDate, double amountPaid) {
        this.propertiesId = propertiesId;
        this.userId = userId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.cancelDate = cancelDate;
        this.bookingDate = bookingDate;
        this.amountPaid = amountPaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertiesId() {
        return propertiesId;
    }

    public void setPropertiesId(int propertiesId) {
        this.propertiesId = propertiesId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public LocalDate getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDate cancelDate) {
        this.cancelDate = cancelDate;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
