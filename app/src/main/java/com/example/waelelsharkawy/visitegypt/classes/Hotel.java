package com.example.waelelsharkawy.visitegypt.classes;

public class Hotel extends Location {

    private String price;

    public Hotel(String name, String price,String description, int image) {
        super(name, description, image);
        this.price = price;
    }

    public String getPrice() {
        return price;
    }
}