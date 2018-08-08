package com.example.waelelsharkawy.visitegypt.classes;

public class Places {
    private String name ;
    private String description;
    private int image;

    public Places(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public Places(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
