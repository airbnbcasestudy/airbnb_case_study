package vn.codegym.airbnb.model;

public class Reviews {
    private int id;
    private int propertyId;
    private int userId;
    private String content;

    public Reviews() {
    }

    public Reviews(int id, int propertyId, int userId, String content) {
        this.id = id;
        this.propertyId = propertyId;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
