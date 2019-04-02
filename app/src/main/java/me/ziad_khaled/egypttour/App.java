package me.ziad_khaled.egypttour;

public class App {
    private int imageID;
    private String name;
    private String description;
    private String url;

    public App(int imageID, String name, String description, String url) {
        this.imageID = imageID;
        this.name = name;
        this.description = description;
        this.url = url;
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

    public String getUrl() {
        return url;
    }
}
