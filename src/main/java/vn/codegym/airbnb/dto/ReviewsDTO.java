package vn.codegym.airbnb.dto;

public class ReviewsDTO {
    private int id;
    private int propertyId;
    private String userName;
    private String content;

    public ReviewsDTO(int id, int propertyId, String userName, String content) {
        this.id = id;
        this.propertyId = propertyId;
        this.userName = userName;
        this.content = content;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
