package models;

import models.Interfaces.Pressable;

public class Button implements Pressable {


    @Override
    public String press() {
        return "нажал на кнопку";
    }
}

