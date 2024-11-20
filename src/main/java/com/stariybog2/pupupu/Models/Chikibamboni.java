package com.stariybog2.pupupu.Models;

public class Chikibamboni {
    int id;
    String color;
    String name;

    public Chikibamboni(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Chikibamboni(int id, String color, String name) {
        this.id = id;
        this.color = color;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
