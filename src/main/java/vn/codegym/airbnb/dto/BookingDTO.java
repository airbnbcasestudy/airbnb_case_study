package vn.codegym.airbnb.dto;

import java.time.LocalDate;
import java.util.Date;

public class BookingDTO {
    private int userId;
    private int propertiesId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double amountPaid;

    public BookingDTO() {
    }

    public BookingDTO(int userId, int propertiesId, LocalDate checkIn, LocalDate checkOut, double amountPaid) {
        this.userId = userId;
        this.propertiesId = propertiesId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.amountPaid = amountPaid;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPropertiesId() {
        return propertiesId;
    }

    public void setPropertiesId(int propertiesId) {
        this.propertiesId = propertiesId;
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

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
