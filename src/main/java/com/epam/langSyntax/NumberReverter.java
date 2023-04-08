package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuffer result = new StringBuffer();

        while (number != 0){
            //getting the last digit of number
            int dig = number %10;
            result.append(dig);

            number = number /10;
        }
        int resInInt = Integer.parseInt(result.toString());
        System.out.println(resInInt);
    }

}
