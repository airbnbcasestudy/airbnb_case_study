package vn.codegym.airbnb.dto;

public class PropertyImageDTO {
    private int propertyId;
    private String name;
    private String description;
    private int userId;
    private int houseTypeId;
    private int roomTypeId;
    private int provinceId;
    private int countryId;
    private String address;
    private int bedroomCount;
    private int bathroomCount;
    private double price;
    private boolean status;
    private int propertyImageId;
    private String imagePath;

    public PropertyImageDTO() {

    }

    public PropertyImageDTO(int propertyId, String name, String description, int userId, int houseTypeId, int roomTypeId, int provinceId, int countryId, String address, int bedroomCount, int bathroomCount, double price, boolean status, int propertyImageId, String imagePath) {
        this.propertyId = propertyId;
        this.name = name;
        this.description = description;
        this.userId = userId;
        this.houseTypeId = houseTypeId;
        this.roomTypeId = roomTypeId;
        this.provinceId = provinceId;
        this.countryId = countryId;
        this.address = address;
        this.bedroomCount = bedroomCount;
        this.bathroomCount = bathroomCount;
        this.price = price;
        this.status = status;
        this.propertyImageId = propertyImageId;
        this.imagePath = imagePath;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
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

    public int getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(int houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedroomCount() {
        return bedroomCount;
    }

    public void setBedroomCount(int bedroomCount) {
        this.bedroomCount = bedroomCount;
    }

    public int getBathroomCount() {
        return bathroomCount;
    }

    public void setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
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

    public int getPropertyImageId() {
        return propertyImageId;
    }

    public void setPropertyImageId(int propertyImageId) {
        this.propertyImageId = propertyImageId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
