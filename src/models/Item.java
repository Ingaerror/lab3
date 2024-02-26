package models;

import models.Interfaces.ToFind;

import java.util.Arrays;
import java.util.Objects;

public class Item extends Entity implements ToFind {
    String adjective="";
    int x;
    public Item(String name) {
        this.name=name;
        this.location=new Location(this, null, null, 0);
    }

    public Item(String name, String adjective) {
        this.name=name;
        this.location=new Location(this, null, null, 0);
        this.adjective=adjective;
    }
    public Item(String name, String adjective, int x) {
        this.name=name;
        this.location=new Location(this, null, null, 0);
        this.adjective=adjective;
        this.x=x;
    }

    @Override
    public Item findByName(Item[] itemsList, String name) {
        for (Item item : itemsList) {
            if (Objects.equals(item.name, name)) {
                return item;
            }
        }
        return new Item("Nothing");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "adjective='" + adjective + '\'' +
                ", x=" + x +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
