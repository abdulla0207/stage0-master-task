package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = 0;
        if(year <= 0) {
            System.out.println("invalid date");
            return;
        }

        if(month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        if(month == 4 || month == 6 || month == 9 || month == 11)
            days = 30;
        else if(month == 2)
            days = isLeapYear ? 29 : 28;
        else
            days = 31;

        System.out.println(days);
    }

}
