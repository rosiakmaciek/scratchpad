package pl.coderslab;

import java.util.StringTokenizer;

public class Excercise3 {

    public static void main(String[] args) {

        System.out.println(checker("dru2gi pier1wszy trzeci3 pia5ty c4zwarty"));

    }


    public static String checker(String toCheck) {

        StringTokenizer tokenizer = new StringTokenizer(toCheck);
        String[] arrayToPrintFrom = new String[tokenizer.countTokens()];

        while(tokenizer.hasMoreTokens()) {

            String currentToken = tokenizer.nextToken();

            for(int i = 0; i < currentToken.length(); i++) {

                if(Character.isDigit(currentToken.charAt(i))) {
                    arrayToPrintFrom[Character.getNumericValue(currentToken.charAt(i)) - 1] = currentToken;
                }

            }

        }

        StringBuilder sb = new StringBuilder();

        for(String element : arrayToPrintFrom) {
            sb.append(element).append(" ");
        }

        return sb.toString();

    }
}
