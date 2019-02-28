package pl.coderslab;

import java.util.*;

public class OCEX2 {

    public static void main(String[] args) {

        int[] test = {3, 5, 1, 0, 2, 4, 7, 8, 10, 11, 9, 6};

        System.out.println(solution(test));

    }

    public static int solution(int[] A) {

        if (A.length == 0) {
            return 0;
        }

        int counter = 1;

        SortedSet<Integer> howManyBeads = new TreeSet<>();

        for (int i = 0; i < A.length; i++) {

            int closing = i;

            while (A[closing] != i) {
                counter++;
                closing = A[closing];
            }

            howManyBeads.add(counter);
            counter = 1;

        }

        return howManyBeads.last();

    }

}

