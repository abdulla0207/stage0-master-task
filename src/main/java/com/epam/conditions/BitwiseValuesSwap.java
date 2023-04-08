package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("Result - 1:"+ first + " 2:" + second);
    }

}
