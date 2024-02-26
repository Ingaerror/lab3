package models;

import models.Interfaces.ToFind;

import java.util.Arrays;
import java.util.Objects;

public class Character extends Entity {
    BodyParts[] bodyParts;
    Times[] times;
    public Item[] items;
    String adjective="";
    boolean isClumsy;
    Senses[] sense;
    Places[] place;
    Measures[] measure;
    public Character(String name) {
        this.name = name;
        this.location = new Location(this, null, null, 0);
        this.bodyParts = new BodyParts[]{
                BodyParts.Back, BodyParts.Ears, BodyParts.Fours, BodyParts.Leg, BodyParts.Toes, BodyParts.Heartbeat, BodyParts.Cheast,BodyParts.Hand,BodyParts.Teeth,BodyParts.Heart
        };
        this.place = new Places[]{
                Places.MansonStreet, Places.MountBangor, Places.Mount, Places.Street, Places.Streets, Places.grave, Places.roof, Places.hill
        };
        this.items = new Item[]{};
        this.sense = new Senses[]{
                Senses.SenseOfDanger,Senses.panic,Senses.allSweaty
        };
        this.measure = new Measures[]{
                Measures.feet, Measures.yards, Measures.miles, Measures.yard
        };
        this.isClumsy = false;
    }
    public Character(String name,boolean isClumsy) {
        this.name = name;
        this.location = new Location(this, null, null, 0);
        this.bodyParts = new BodyParts[]{
                BodyParts.Back, BodyParts.Ears, BodyParts.Fours, BodyParts.Leg, BodyParts.Toes, BodyParts.Heartbeat, BodyParts.Cheast,BodyParts.Hand,BodyParts.Teeth,BodyParts.Heart
        };
        this.place = new Places[]{
                Places.MansonStreet, Places.MountBangor, Places.Mount, Places.Street, Places.Streets, Places.grave, Places.roof, Places.hill
        };
        this.items = new Item[]{};
        this.times = new Times[]{
                Times.fewMinutes, Times.hour, Times.rightnow, Times.soLong
        };
        this.sense = new Senses[]{
                Senses.SenseOfDanger,Senses.panic,Senses.allSweaty
        };
        this.measure = new Measures[]{
                Measures.feet, Measures.yards, Measures.miles, Measures.yard
        };
        this.isClumsy = isClumsy;
    }
    public Character(String name,boolean isClumsy, String adjective) {
        this.name = name;
        this.location = new Location(this, null, null, 0);
        this.bodyParts = new BodyParts[]{
                BodyParts.Back, BodyParts.Ears, BodyParts.Fours, BodyParts.Leg, BodyParts.Toes, BodyParts.Heartbeat, BodyParts.Cheast,BodyParts.Hand,BodyParts.Teeth,BodyParts.Heart
        };
        this.place = new Places[]{
                Places.MansonStreet, Places.MountBangor, Places.Mount, Places.Street, Places.Streets, Places.grave, Places.roof, Places.hill
        };
        this.items = new Item[]{};
        this.times = new Times[]{
                Times.fewMinutes, Times.hour, Times.rightnow
        };
        this.sense = new Senses[]{
                Senses.SenseOfDanger,Senses.panic,Senses.allSweaty
        };
        this.measure = new Measures[]{
                Measures.feet, Measures.yards, Measures.miles, Measures.yard
        };
        this.isClumsy = isClumsy;
        this.adjective=adjective;
    }
    public void firstAction(Item grid) {
        this.throwItem(grid);
        System.out.print(", ");
        this.fellOver(grid);
        System.out.print(" и ");
        this.jumpDown();
        System.out.println(".");
    }
    private void jumpDown() {
        System.out.print("прыгнул вниз");
    }
    private void fellOver(ToFind grid) {
        System.out.print("перевалился через " + grid.getName());
    }
    private void throwItem(Item grid) {
        grid.setLocation(grid.findByNameItem(grid.items, "пиками"));
        this.findByNameBodyParts(this.bodyParts, "ногу").setLocation(grid);
        System.out.print("Теперь " + this.name + " перекинул " + this.findByNameBodyParts(this.bodyParts, "ногу").getBodyPart() + " через " + grid.getName() + " увенчанную " + grid.findByNameItem(grid.items, "пиками").name);
    }
    public BodyParts findByNameBodyParts(BodyParts[] bodyPartsList, String name) {
        for (BodyParts bodyPart : bodyPartsList) {
            if (Objects.equals(bodyPart.nameBodyPart, name)) {
                return bodyPart;
            }
        }
        return null;
    }
    public Senses findByNameSense(Senses[] sensesList, String name) {
        for (Senses sense : sensesList) {
            if (Objects.equals(sense.WhatFeel, name)) {
                return sense;
            }
        }
        return null;
    }
    public Times findTime(Times[] timesList, String name) {
        for (Times time : timesList) {
            if (Objects.equals(time.callTimes, name)) {
                return time;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "Character{" +
                "adjective='" + adjective + '\'' +
                ", isClumsy=" + isClumsy +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return isClumsy == character.isClumsy && Arrays.equals(bodyParts, character.bodyParts) && Arrays.equals(items, character.items) && Objects.equals(adjective, character.adjective);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adjective, isClumsy);
    }
}