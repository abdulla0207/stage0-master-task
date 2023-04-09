package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if(divider == 0)
            return;
        int divRes = dividend/divider;

        int multByDivider = divRes * divider;

        if(multByDivider == dividend)
            System.out.println("Can be divided completely");
        else
            System.out.println("cannot be divided completely");
    }

}
