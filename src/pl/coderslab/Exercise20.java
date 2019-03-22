package pl.coderslab;

import java.util.Arrays;

public class Exercise20 {

    public static void main(String[] args) {

        System.out.println(nextSmaller(1027));

    }

    public static long nextSmaller(long n) {
        int[] digits = String.valueOf(n).chars().toArray();
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] > digits[i + 1]) {
                return generateValue(digits, i);
            }
        }
        return -1;
    }

    private static long generateValue(int[] digits, int ind) {
        int swapInd = findNextSmallestDigit(digits, ind);
        swap(digits, ind, swapInd);
        Arrays.sort(digits, ind + 1, digits.length);
        reverse(digits, ind + 1);

        if (digits[0] == '0') {
            return -1;
        }
        return Long.valueOf(new String(digits, 0, digits.length));
    }

    private static int findNextSmallestDigit(int[] digits, int ind) {
        int resultInd = ind + 1;
        for (int i = resultInd + 1; i < digits.length; i++) {
            if (digits[i] < digits[ind] && digits[i] > digits[resultInd]) {
                resultInd = i;
            }
        }
        return resultInd;
    }

    private static void reverse(int[] digits, int startAt) {
        for (int i = startAt; i < (digits.length + startAt) / 2; i++) {
            swap(digits, i, digits.length - i + startAt - 1);
        }
    }

    private static void swap(int[] digits, int indA, int indB) {
        int temp = digits[indA];
        digits[indA] = digits[indB];
        digits[indB] = temp;
    }

}
