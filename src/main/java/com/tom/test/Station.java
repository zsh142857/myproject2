package com.tom.test;

public class Station {
    public static final Station TAIPEI_STATION=
            new Station(1000,"Taipei");
    public  static final Station TAICHUNG_STATION=
            new Station(2000,"Taichung");
    public  static final Station KAOHSIUNG_STATION=
            new Station(3300,"Kaohsiung");
    int id;
    String name;
    public Station(int id,String name){
        this.id=id;
        this.name=name;
    }
}
