package models;

public enum Senses {
    SenseOfDanger("ощущение опасности"), allSweaty("Весь в поту"), panic("панике");
    final String WhatFeel;
    Senses(String name){
        this.WhatFeel = name;
    }
    public String getFeel(){
        return this.WhatFeel;
    }
}
