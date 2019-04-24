package vn.codegym.airbnb.model;

public class PropertiesImg {
    private int id;
    private int propertyId;
    private String imagePath;

    public PropertiesImg() {
    }

    public PropertiesImg(int propertyId, String imagePath) {
        this.propertyId = propertyId;
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
