package com.example.pokeapp.model;

public class PokeModel {
    private String id;
    private String name;
    private String description;
    private int imageName;

    public PokeModel(String id, String name, String description, int nameImage ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageName = nameImage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getNameImage() {
        return imageName;
    }

    public void setNameImage(int nameImage) {
        this.imageName = nameImage;
    }
}
