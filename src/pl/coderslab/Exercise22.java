package pl.coderslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise22 {

    public static void main(String[] args) {

        System.out.println(findMidPerm("abc"));

    }

    public static String findMidPerm(String strng) {

        String[] myArray = permutation("", strng).toArray(new String[permutation("", strng).size()]);

        Arrays.sort(myArray);

        for(String st : myArray) {
            System.out.println(st);
        }

        System.out.println(" ");

        if(myArray.length % 2 == 0) {
            return myArray[myArray.length / 2 - 1];
        } else {
            return myArray[(int) ((myArray.length / 2) + 0.5) - 1];
        }

    }

    private static List<String> permutation(String prefix, String str) {
        List<String> permutations = new ArrayList<>();
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
                permutations.addAll(permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n)));
        }
        return permutations;
    }

}
