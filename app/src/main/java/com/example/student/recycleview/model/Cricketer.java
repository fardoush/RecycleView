package com.example.student.recycleview.model;

public class Cricketer {
    private  int image;
    private  String name;

    public Cricketer(int image, String name) {//alter+insert
        this.image = image;
        this.name = name;
    }

    public int getImage() {

        return image;
    }

    public String getName() {

        return name;
    }
}
