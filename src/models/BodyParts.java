package models;

public enum BodyParts {
    Leg("ногу"),
    Back("спину"),
    Toes("носки"),
    Fours("четвереньки"),
    Ears("уши"),
    Heartbeat("удары сердца"),
    Cheast("груди"),
    Heart("Сердце"),
    Teeth("зубы"),
    Hand("руках");
    final String nameBodyPart;
    final Location location;
    BodyParts(String name){
        this.location = new Location(this,null, null, 0);
        this.nameBodyPart = name;
    }
    public String getBodyPart(){
        return this.nameBodyPart;
    }
    public void setLocation(Item newLocation){
        this.location.where = newLocation;
    }
}
