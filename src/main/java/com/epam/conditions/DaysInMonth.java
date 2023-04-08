package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isLeapYear = false;
        int days = 0;
        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 == 0)
                isLeapYear = true;
            isLeapYear = true;
        }

        if(month < 1 || month > 12) {
            System.out.println("Invalid month");
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
