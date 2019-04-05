package pl.coderslab;

import java.util.Arrays;

public class Exercise1BV {

    public String solution(int[] T) {

        int[] winter = Arrays.copyOfRange(T, 0, T.length/4);
        int[] spring = Arrays.copyOfRange(T, T.length/4, T.length / 2);
        int[] summer = Arrays.copyOfRange(T, T.length/2, 3 * T.length / 4);
        int[] autumn = Arrays.copyOfRange(T, (3 * T.length / 4), T.length);

        int wint = aplitude(winter);
        int spr = aplitude(spring);
        int summ = aplitude(summer);
        int aut = aplitude(autumn);

        int[] tempArray = {wint, spr, summ, aut};
        Arrays.sort(tempArray);

        int max = tempArray[tempArray.length - 1];

        if(wint == max) {
            return "WINTER";
        } else if(spr == max) {
            return "SPRING";
        } else if(summ == max) {
            return "SUMMER";
        } else if(aut == max) {
            return "AUTUMN";
        }

        return "SOMETHING'S WRONG";
    }

    public static int aplitude(int[] part) {

        int min = 1000;
        int max = -1000;

        for(int temp : part) {
            if(temp < min) {
                min = temp;
            }

            if(temp > max) {
                max = temp;
            }
        }

        return max - min;

    }



}
