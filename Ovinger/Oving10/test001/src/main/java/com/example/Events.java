package com.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Events {
    private final int num; //entydig nummer
    private final String name;
    private String location;
    private String organizer;
    private String type;
    private final long time;

    public Events(int num, String name, String location, String organizer, String type, long time){
        this.num = num;
        this.name = name;
        this.location = location;
        this.organizer = organizer;
        this.type = type;
        this.time = time; // 200210301800 20021030 1800
        //(kl 18 den 30.oktober 2002)
    }
    /**
     *
     * @return attributtene
     */
    public int getNum(){return num;}
    public String getName(){return name;}
    public String getLocation(){return location;}
    public String getOrganizer(){return organizer;}
    public String getType(){return type;}
    public long getTime(){return time;}

    /**
     * Setters
     * @param time
     * @return time
     */
    public long setTimeNow(long time){return time;}

    /**
     *
     * @return toString
     */
    @Override
    public String toString(){
        return "number: "+ num + ", name: " + name + ", locations: "+location + ", organizer: " +organizer + ", type: "+ type + ", time: " + time;
    }

}
