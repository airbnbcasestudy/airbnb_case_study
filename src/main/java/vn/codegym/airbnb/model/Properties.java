package vn.codegym.airbnb.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "properties")
public class Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int userId;
    private String houseType;
    private String address;
    private int bedRooms;
    private int bathRooms;
    private double price;
    private boolean status;
    private String imageDefault;

    public Properties() {
    }

    public Properties(int userId, String imageDefault) {
        this.userId = userId;
        this.imageDefault = imageDefault;
    }

    public Properties(String name, String description, int userId, String houseType, String address, int bedRooms, int bathRooms, double price, boolean status, String imageDefault) {
        this.name = name;
        this.description = description;
        this.userId = userId;
        this.houseType = houseType;
        this.address = address;
        this.bedRooms = bedRooms;
        this.bathRooms = bathRooms;
        this.price = price;
        this.status = status;
        this.imageDefault = imageDefault;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public int getBathRooms() {
        return bathRooms;
    }

    public void setBathRooms(int bathRooms) {
        this.bathRooms = bathRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImageDefault() {
        return imageDefault;
    }

    public void setImageDefault(String imageDefault) {
        this.imageDefault = imageDefault;
    }
}
