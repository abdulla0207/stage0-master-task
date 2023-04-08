package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int divRes = dividend/divider;
        int multByDivider = divRes * divider;

        if(multByDivider == dividend)
            System.out.println("Can be divided completely");
        else
            System.out.println("Division by zero");
    }

}
