package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Exercise21 {

    public static void main(String[] args) {

        int[] array = new int[1];

        System.out.println(isInteresting(123454319, array));

    }

    public static int isInteresting(int number, int[] awesomePhrases) {

        if(number < 100) {
            return 0;
        }

        if(first(number) || second(number) || third(number) || fourth(number, awesomePhrases)) {
            return 2;
        } else if (first(number + 1) || second(number + 1) || third(number + 1) || fourth(number + 1, awesomePhrases)
        || first(number + 2) || second(number + 2) || third(number + 2) || fourth(number + 2, awesomePhrases)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static boolean first(int number) {

        boolean flag = true;

        String stringNumber = String.valueOf(number);
        char[] numberCharFrom1 = stringNumber.substring(1).toCharArray();
        for (char element : numberCharFrom1) {
            if (element != '0') {
                flag = false;
            }
        }

        return flag;
    }

    public static boolean second(int number) {

        boolean flag = true;

        String stringNumber = String.valueOf(number);
        char[] numberChar = stringNumber.toCharArray();
        for(int i = 0; i < numberChar.length; i++) {
            if(numberChar[0] != numberChar[i]) {
                flag = false;
            }
        }

        return flag;
    }

    public static boolean third(int number) {

        String up = "1234567890";
        String down = "9876543210";

        String myNumber = String.valueOf(number);
        StringBuilder sb = new StringBuilder(myNumber);
        String myNumberReversed = sb.reverse().toString();

        boolean flag = false;

        if(up.contains(myNumber) || down.contains(myNumber) || myNumber.equals(myNumberReversed)) {
            flag = true;
        }

        return flag;
    }

    public static boolean fourth(int number, int[] awesomePhrases) {

        boolean flag = false;

        String myNumber = String.valueOf(number);

        List<String> myNumbersArray = new ArrayList<>();

        for(int element : awesomePhrases) {
            myNumbersArray.add(String.valueOf(element));
        }

        if(myNumbersArray.contains(myNumber)) {
            flag = true;
        }

        return flag;
    }

}


//Let's make it so Bob never misses another interesting number. We've hacked into his car's computer, and we have a box hooked up that reads mileage numbers. We've got a box glued to his dash that lights up yellow or green depending on whether it receives a 1 or a 2 (respectively).
//
//It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number input, and returns a 2 if the number is "interesting" (see below), a 1 if an interesting number occurs within the next two miles, or a 0 if the number is not interesting.
//
//Note: In Haskell, we use No, Almost and Yes instead of 0, 1 and 2.
//"Interesting" Numbers
//
//Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:
//
//    Any digit followed by all zeros: 100, 90000
//    Every digit is the same number: 1111
//    The digits are sequential, incementing†: 1234
//    The digits are sequential, decrementing‡: 4321
//    The digits are a palindrome: 1221 or 73837
//    The digits match one of the values in the awesomePhrases array
//
//    † For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
//    ‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.