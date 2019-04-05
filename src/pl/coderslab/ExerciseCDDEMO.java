package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class ExerciseCDDEMO {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 5, 6, 7};

        System.out.println(solution(testArray));

    }

    public static int solution(int[] A) {

        List<Integer> myList = new ArrayList<>();
        int toReturn = 0;

        for (int number : A) {
            myList.add(number);
        }

        for (int i = 1; i < 1000000; i++) {
            if (!myList.contains(i)) {
                toReturn = i;
                break;
            }
        }

        return toReturn;

    }

}

//This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].



