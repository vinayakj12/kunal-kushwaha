package com.company.OOPS;

public class Enums {
    enum Week {
        Monday,Tuesday,wednesday
        // these are enum constants
        // public , static and final
        // since its final you can create child enums
        // type is week
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day: Week.values())
        {
            System.out.println(day);
        }

    }
}
