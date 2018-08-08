package com.example.waelelsharkawy.visitegypt.classes;

public class Hotel {
    private String name ;
    private String description;
    private String price;
    private int image;

    public Hotel(String name, String price,String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price=price;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

}
