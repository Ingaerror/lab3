package models;

public enum Places {
    MansonStreet("Мэсонстрит"), MountBangor("кладбища Бангора"), Mount("кладбища"), Street("Улица"), Streets("улицу"), roof("крышей"), grave("могилу"), hill("холм");

    final String namePlace;


    Places(String name){
        this.namePlace = name;
    }

    public String getPlace(){
        return this.namePlace;
    }

}
