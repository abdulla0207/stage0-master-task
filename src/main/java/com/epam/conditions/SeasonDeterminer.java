package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if(monthNumber < 1 || monthNumber > 12) {
            System.out.println("Wrong month number");
            return;
        }

        if(monthNumber >= 3 && monthNumber <= 5)
            System.out.println("Spring");
        else if(monthNumber >= 6 && monthNumber <= 8)
            System.out.println("Summer");
        else if(monthNumber >= 9 && monthNumber <= 11)
            System.out.println("Fall");
        else
            System.out.println("Winter");
    }

    public static void main(String[] args) {
        new SeasonDeterminer().tellTheSeason(0);
    }
}
