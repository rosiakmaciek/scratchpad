package pl.coderslab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OCEX1 {

    public static void main(String[] args) {

        int[] test = {3, 5, -3, 1, 12};

        System.out.println(solution(test));

    }

    public static int solution(int[] A) {

        List<Integer> tempList = new ArrayList<>();
        int tempSum = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] >= 0) {
                tempSum += A[i];
            } else {
                tempList.add(tempSum);
                tempSum = 0;
            }

            tempList.add(tempSum);

        }

        Collections.sort(tempList);

        int max = tempList.get(tempList.size() - 1);

        if (max >= 0) {
            return max;
        } else {
            return -1;
        }

    }

}
