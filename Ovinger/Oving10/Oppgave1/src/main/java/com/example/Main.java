package com.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //event register
        EventRegister register = new EventRegister();
        //random klasse
        Random random = new Random();

        //attributter
        String[] names = {"Sirkus", "Konsert", "Theater", "Exhibition", "Workshop"};
        String[] locations = {"Trondheim", "Oslo", "Kairo", "California", "Lofoten"};
        String[] organizer = {"Aker", "Equinor", "Kongsberg", "LookheadMartin", "BlackRock"};
        String[] types = {"Festival", "Concert", "Show", "Exhibit", "Conference"};

        // Create and register 5 random events
        for (int i = 1; i <= 10; i++) {
            String name = names[random.nextInt(names.length)];
            String city = locations[random.nextInt(locations.length)];
            String venue = organizer[random.nextInt(organizer.length)];
            String type = types[random.nextInt(types.length)];
            long date = 202412010000L + random.nextInt(30) * 10000L + random.nextInt(24) * 100L; //random date to Dec 2024

            Events newEvent = new Events(i, name, city, venue, type, date);
            register.registerNewEvent(newEvent);
        }
        boolean runner = true;

        while (runner) {
            System.out.println("--Chose an option--");
            System.out.println("1. Find events at a location");
            System.out.println("2. Find events at a date");
            System.out.println("3. Find events between two date intervalls (two digits)");
            System.out.println("4. View all events based on either location, type or time");
            System.out.println("5. Exit");


            int choice1 = scanner.nextInt();
            scanner.nextLine();

            //allerede satt inn input
            switch (choice1) {
                case 1:
                    String location = "Trondheim";
                    register.findEvent(location);
                    break;
                case 2:
                    Long time = 202412201800L;
                    register.findEvent(time);
                    break;
                case 3:
                    register.findEventTimeIntervals(20001030, 20241230);
                    break;
                case 4:
                    System.out.println("Chose: ");
                    System.out.println("1 for sort by location");
                    System.out.println("2 for sort by type");
                    System.out.println("3 for sort by time");
                    int choice2 = scanner.nextInt();
                    register.allEvents(choice2);
                    break;
                case 5:
                    runner = false;
                    System.out.println("Exiting");
                    break;
            }
        }
    }
}