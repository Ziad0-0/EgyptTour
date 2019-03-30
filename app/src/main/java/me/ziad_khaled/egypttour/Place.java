package me.ziad_khaled.egypttour;

public class Place {
    private int imageID;
    private String name;
    private String description;
    private String location;

    public Place(int imageID, String name, String description, String location) {
        this.imageID = imageID;
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }
}
