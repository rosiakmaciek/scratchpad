package pl.coderslab;

import java.util.StringTokenizer;

public class Excercise1 {

    public static void main(String[] args) {

        int[] givenArray = {3, 1, 4, 2, 8, 7, 5, 6, 8, 10, 13, 9, 12, 11, 0, 14, 15, 17};

        System.out.println(findMissingElement(givenArray));
        System.out.println(recursiveFactorial(5));
        System.out.println(factorial(5));
        System.out.println(shortFibonacci(7));
        System.out.println(recursiveFibonacci(7));

        String[] myArray = splitByWhite("Text to be splitted");

        for(String text : myArray) {
            System.out.println(text);
        }
        
    }

    private static int findMissingElement(int[] array) {

        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[j] == i) {
                    flag = true;
                }
            }
            if (!flag) {
                return i;
            }
            flag = false;
        }
        return -1;
    }

    private static int recursiveFactorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return (n * (recursiveFactorial(n - 1)));
        }

    }

    private static int factorial(int n) {

        int factorialSum = 1;

        for (int i = 1; i < n + 1; i++) {
            factorialSum *= i;
        }

        return factorialSum;
    }

    private static int shortFibonacci(int n) {

        int prev2 = 0;
        int prev1 = 1;
        int tempSum = 1;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {

            for (int i = 2; i < n + 1; i++) {

                tempSum = prev2 + prev1;
                prev2 = prev1;
                prev1 = tempSum;
            }

        }
        return tempSum;
    }

    private static int recursiveFibonacci(int n) {

        if (n < 2) {
            return n;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }

    }

    private static String[] splitByWhite(String stringToSplit) {

        StringTokenizer token = new StringTokenizer(stringToSplit);
        String[] array = new String[token.countTokens()];

        for(int i = 0; i < array.length; i++) {
            array[i] = token.nextToken();
        }

        return array;

    }

}

//Napisz metodę findMissingElement, która jako argument przyjmuje tablicę liczb całkowitych z
// zakresu od 0 do n. Liczby w tablicy nie powtarzają się.
// W tablicy brakuje jednego elementu z zakresu <0, n>.
// Metoda findMissingElementpowinna zwrócić brakujący element.