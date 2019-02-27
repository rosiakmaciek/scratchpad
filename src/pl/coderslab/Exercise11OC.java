package pl.coderslab;

import java.util.Arrays;

public class Exercise11OC {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5, 7, 8, 9};

        System.out.println(solution(A));

    }

    public static int solution(int[] A) {

        Arrays.sort(A);
        int max = A[A.length -1];

        if(max < 2) {
            return 1;
        }

        int toReturn = 2;
        boolean contains = true;

        while(contains) {

            contains = false;

            for(int i = toReturn; i < max + 1; i++) {
                for(int j = 0; j < A.length; j++) {
                    if(A[j] == i) {
                        contains = true;
                    }
                }
                if(!contains) {
                    toReturn = i;
                    return toReturn;
                }

                contains = false;
            }

        }

        return toReturn;

    }

}
