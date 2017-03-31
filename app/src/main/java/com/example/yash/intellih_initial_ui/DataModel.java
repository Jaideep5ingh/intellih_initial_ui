package com.example.yash.intellih_initial_ui;

/**
 * Created by Admin on 31-03-2017.
 */

class DataModel {
    String room;
    int image;

    public DataModel(String room, int image) {
        this.room = room;
        this.image = image;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
