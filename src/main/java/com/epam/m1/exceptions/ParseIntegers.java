package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {

        Iterator<String> words = WORDS.iterator();
        boolean isParsable;
        int sum = 0;
        String justWords = "";

            while (words.hasNext()) {
                    isParsable = true;

                    String next = words.next();


                    int number = 0;
                    try {
                        Integer.parseInt(next);
                    }
                    catch (NumberFormatException e){
                        isParsable = false;
                    }


                if (isParsable) {
                    number = Integer.parseInt(next);
                }
                // todo: complete it
                sum += number;
                String[] arr = next.split(" ");
                for(int i = 0; i < arr.length; i++){
                    if(!isNumeric(arr[i])){
                        justWords += arr[i] + " ";
                    }
                }


            }





        System.out.println("Sum is " + sum);
        System.out.println("Just words: " + justWords.trim());
    }
}

