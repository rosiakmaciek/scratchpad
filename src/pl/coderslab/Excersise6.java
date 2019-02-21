package pl.coderslab;

public class Excersise6 {

    public static void main(String[] args) {

        String[] testArray = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};

        System.out.println(longestConsec(testArray, 1));

    }

    public static String longestConsec(String[] strarr, int k) {

        int longestPosition = 0;
        int wordLength = 0;

        if(strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }

        String[] arrayToSort = new String[strarr.length - k + 1];

        for(int i = 0; i < strarr.length - k + 1; i++) {

            String stringToPut = "";

            for(int j = i; j < i + k; j++) {
                stringToPut += strarr[j];
            }

            arrayToSort[i] = stringToPut;

            if(arrayToSort[i].length() > wordLength) {
                wordLength = arrayToSort[i].length();
                longestPosition = i;
            }

        }

        return arrayToSort[longestPosition];

    }

}

//You are given an array strarr of strings and an integer k. Your task is to return the first longest
// string consisting of k consecutive strings taken in the array.
//Example:
//
//longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"