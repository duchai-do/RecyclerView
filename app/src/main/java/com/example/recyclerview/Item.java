package com.example.recyclerview;

public class Item {

    String name;
    int image;
    public Item(String name, int image) {
        this.name = name;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

}
