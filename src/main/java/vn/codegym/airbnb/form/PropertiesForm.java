package vn.codegym.airbnb.form;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class PropertiesForm {
    private String nameHouse;
    private String editorDescription;
    private int userId;
    private String houseType;
    private String address;
    private int bedRooms;
    private int bathRooms;
    private double price;
    private boolean status;
    private MultipartFile[] images;

    public PropertiesForm() {
    }

    public PropertiesForm(String nameHouse, String editorDescription, int userId, String houseType, String address, int bedRooms, int bathRooms, double price, boolean status, MultipartFile[] images) {
        this.nameHouse = nameHouse;
        this.editorDescription = editorDescription;
        this.userId = userId;
        this.houseType = houseType;
        this.address = address;
        this.bedRooms = bedRooms;
        this.bathRooms = bathRooms;
        this.price = price;
        this.status = status;
        this.images = images;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public String getEditorDescription() {
        return editorDescription;
    }

    public void setEditorDescription(String editorDescription) {
        this.editorDescription = editorDescription;
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

    public MultipartFile[] getImages() {
        return images;
    }

    public void setImages(MultipartFile[] images) {
        this.images = images;
    }
}
