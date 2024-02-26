package models;

public class Flashlight extends Item{
    String adjective="";
    public Flashlight(String name) {
        super(name);
    }
    public Flashlight(String name, String adjective) {
        super(name);
        this.adjective=adjective;
    }
}
