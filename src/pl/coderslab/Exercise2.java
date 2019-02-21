package pl.coderslab;

import java.util.Arrays;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println(sortDesc(73451));

    }

    public static int sortDesc(final int num) {

        Integer[] array = new Integer[String.valueOf(num).length()];
        String numbers = String.valueOf(num);

        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(numbers.charAt(i));
        }

        Arrays.sort(array);
        String toReturn = "";

        for(int i = 0; i < array.length; i++) {
            toReturn += array[i];
        }

        return Integer.valueOf(toReturn);

    }

}
