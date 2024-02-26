package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public abstract class Entity {
    public String name;
    public Location location;
    Item[] items;
    public void give(Item item) {
        ArrayList<Item> arrayItems = new ArrayList<>();
        if (this.items != null) {
            arrayItems.addAll(Arrays.asList(this.items));
        }
        arrayItems.add(item);
        this.items = arrayItems.toArray(new Item[0]);
    }

    public Item findByNameItem(Item[] itemsList, String name) {
        for (Item item : itemsList) {
            if (Objects.equals(item.name, name)) {
                return item;
            }
        }
        return new Item("Nothing");
    }

    public void setLocation(Item newLocation){
        this.location.where = newLocation;
    }
}
