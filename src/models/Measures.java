package models;

public enum Measures {
    feet("футах"), yards("ярдах"), miles("милями"), yard("ярды");
    final String WhatMeasure;
    Measures(String name){
        this.WhatMeasure = name;
    }
    public String getMeasure(){
        return this.WhatMeasure;
    }
}
