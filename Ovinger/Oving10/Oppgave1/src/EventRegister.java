package com.example;
//import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;




public class EventRegister {
    //HashMap<String, Events> events;
    ArrayList<Events> events;

    /**
     * Constructor
     */
    public EventRegister(){
        this.events = new ArrayList<>();
    }

    /**
     * Register new event
     * @param event
     */
    public void registerNewEvent(Events event){
        boolean eventExist = false;
        Iterator<Events> iterator = events.iterator();

        while(iterator.hasNext()){
            if (iterator.next().equals(event)){
                System.out.println("Event already exist");
                eventExist = true;
                break;
            }
        }
        if(!eventExist){
            events.add(event);
            System.out.println("Added event: " + event.getName());
        }
    }
    /**
     * Method that finds the object based on input string (location) or int (time)
     * @param find
     */
    public void findEvent(Object find){
        if (find instanceof String){
            List<Events> foundLocations = events.stream()
                    .filter(loc -> loc.getLocation().equals(find))
                    .collect(Collectors.toList());
            if (!foundLocations.isEmpty()) {
                foundLocations.forEach(loc -> System.out.println("Event at " + find + ": " + loc));
            } else {
                System.out.println("Location not found");
            }
            /*
            Optional<Events> foundLocation = events.stream()
                    .filter(loc -> loc.getLocation().equals(find))
                    .findFirst();
            foundLocation.ifPresentOrElse(
                    loc -> System.out.println("Event at " + find + ": " + loc),
                    () -> System.out.println("Location not found")
            );*/
        } else if (find instanceof Long) {
            //convert from Integer to long
            long findAsLong = (Long) find;
            List<Events> foundTimes = new ArrayList<>(events.stream()
                    .filter(time -> time.getTime() == findAsLong)
                    .collect(Collectors.toList()));
            if (!foundTimes.isEmpty()) {
                foundTimes.forEach(time -> System.out.println("Event at " + find + ": " + time));
            } else {
                System.out.println("Time not found");
            }
        }
    }

    /**
     * Find event between to dates
     * @param date1 to digits
     * @param date2 to digits
     */
    public void findEventTimeIntervals(int date1, int date2) {
        ArrayList<Events> eventsIntervals = new ArrayList<>();

        System.out.println("All events between intervals: " + date1 + " and " + date2 + ". Sorted by time ");

        for (Events event : events) {
            long eventTime = event.getTime();

            String timeString = Long.toString(eventTime);
            if (timeString.length() >= 8) {
                String extractDate = timeString.substring(0, 8);
                int extractDateInt = Integer.parseInt(extractDate);

                if (extractDateInt >= date1 && extractDateInt <= date2) {
                    eventsIntervals.add(event);
                }
            } else {
                System.out.println("Invalid time format: " + timeString);
            }
        }
        Collections.sort(eventsIntervals, (e1, e2) -> Long.compare(e1.getTime(), e2.getTime()));
        for (Events event : eventsIntervals) {
            System.out.print(" - ");System.out.println(event);
        }

    }

    /**
     * Print out events sorted by, location, type and time
     */
    public void allEvents(int choice){
        System.out.print("All events ");
        switch (choice){
            case 1:
                System.out.println("sorted by location:");
                events.sort(Comparator.comparing(eventLoc -> eventLoc.getLocation()));
                break;
            case 2:
                System.out.println("sorted by type:");
                events.sort(Comparator.comparing(eventType -> eventType.getType()));
                break;
            case 3:
                System.out.println("sorted by time:");
                events.sort((d1, d2) -> Long.compare(d1.getTime(), d2.getTime()));
                break;
            default:
                System.out.println("Invalid token");
        }
        Iterator<Events> iterator = events.iterator();
            while(iterator.hasNext()){
                System.out.print(" - ");
                System.out.println(iterator.next());
            }
            if (events.isEmpty()){
                System.out.println("No events found");
            }
    }
}
