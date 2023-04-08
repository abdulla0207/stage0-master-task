package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int res = 0;

        while(number >0){
            int dig = number % 10;

            res = res + dig;

            number = number /10;
        }

        System.out.println(res);
    }

}
