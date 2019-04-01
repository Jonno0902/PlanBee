package com.scrum.plan.planbee;

import android.location.Location;

import java.util.ArrayList;

public class EventCollection {


    private ArrayList<Event> events;

    public EventCollection(){
        events = new ArrayList<Event>();
    }
    public void generateEvents(){
        events.add(new Event("BPI Group Meeting",
                "1pm March 3rd",
                "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                "Bob Green",
                "BPI group",
                "The group meets",
                0 ));
        events.add(new Event("Drinks with the bois",
                "9pm March 3rd",
                "Frankenstien Pub, Reading, R31 2XQ",
                "Marry Shelley",
                "Chat 5",
                "Just trialing something out so bear with",
                1 ));
        events.add(new Event("Band rehearsal",
                "2pm March 4th",
                "Music room, Middlesbrough University, Middlesbrough, TS4 3JS",
                "Rachel Brown",
                "The instruments",
                "Marmelading at its best",
                2 ));
        events.add(new Event("Scrum 4 Due",
                "12pm March 7th",
                "Brightspace",
                "Mitchell Covern",
                "Scrummers",
                "Things get real",
                3 ));
        events.add(new Event("Cinema",
                "7pm March 8th",
                "Odean, 2 Manor Road, Leeds, LS18 4DX,",
                "Dave Powers",
                "Cinema crew",
                "Bring popcorn - or don't because you're not allowed to.",
                4 ));
        events.add(new Event("Climbing",
                "5pm March 15th",
                "The Project, 3 Cameron St, Glasgow, G52 4JH",
                "Climber co",
                "BU Climbing Club",
                "We get high",
                5 ));
        events.add(new Event("Paint balling",
                "1pm March 22nd",
                "BU Paintball,8 Burleigh Rd, Ringwood, BU2 4NH",
                "BU Paintball",
                "Paint balling",
                "We shoot people",
                6 ));
        events.add(new Event("D&D",
                "8pm March 23rd",
                "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                "Jonno Clarke",
                "Board game cafe",
                "Playing dungeons.",
                7 ));
        events.add(new Event("BU Guest Lecture",
                "11am March 25th",
                "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                "Gernut Leechen",
                "Bournemouth University",
                "Someguy from somewhere is talking about something.",
                8 ));
        events.add(new Event("Team meeting",
                "1:30pm March 29th",
                "Talbot Campus, Fern Barrow, Poole BH12 5BB",
                "Jack Cleary",
                "Neam Tame",
                "We meet, we eat, we greet, we take a seat, it's pretty neat.",
                9 ));
    }
    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

}
class Event{

    private String name;
    private String date;
    private String location;
    private String host;
    private String groupName;
    private String description;
    private int imageIndex;

    public Event(String name, String date, String location, String host, String groupName, String description, int imageIndex) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.host = host;
        this.groupName = groupName;
        this.description = description;
        this.imageIndex = imageIndex;
    }

    public Event(int imageIndex){
        this.name = "";
        this.date = "";
        this.location = "";
        this.host = "";
        this.groupName = "";
        this.description = "";
        this.imageIndex = imageIndex;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(int imageIndex) {
        this.imageIndex = imageIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
