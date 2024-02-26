package models;

public class Location {
    private final String time;
    Object who;
    public Object where;
    int x;


    public Location(Object who, Entity where, String inWhichTime, int x) {
        this.who = who;
        this.where = where;
        this.time = inWhichTime;
        this.x = x;
    }
    public int getDistance(Entity item){
        return  item.location.x - this.x;
    }

    public void setLocation(Object where) {
        this.where = where;
    }
}
