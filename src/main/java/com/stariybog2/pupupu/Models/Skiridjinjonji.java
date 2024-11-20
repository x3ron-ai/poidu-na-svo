package com.stariybog2.pupupu.Models;

public class Skiridjinjonji {
    int id;
    String title;
    String vitali;

    public Skiridjinjonji(String title, String vitali) {
        this.title = title;
        this.vitali = vitali;
    }

    public Skiridjinjonji(int id, String title, String vitali) {
        this.id = id;
        this.title = title;
        this.vitali = vitali;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVitali() {
        return vitali;
    }

    public void setVitali(String vitali) {
        this.vitali = vitali;
    }
}
