package models.Interfaces;

import models.Item;

public interface ToFind {
    Item findByName(Item[] itemsList, String name);
    String getName();
}
