package me.ziad_khaled.egypttour;

public class Dish {
    private int imageID;
    private String recipeURL;
    private String name;
    private String description;

    public Dish(int imageID, String recipeURL, String name, String description) {
        this.imageID = imageID;
        this.recipeURL = recipeURL;
        this.name = name;
        this.description = description;
    }

    public int getImageID() {
        return imageID;
    }

    public String getRecipeURL() {
        return recipeURL;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
