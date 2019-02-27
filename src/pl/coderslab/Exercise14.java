package pl.coderslab;

import java.util.HashSet;
import java.util.Set;

public class Exercise14 {

    public static void main(String[] args) {

        check("To jest moje, zdanie");

    }

    public static boolean check(String sentence) {

        String sentenceToCheck = sentence.replaceAll("[\\W]", "").toLowerCase();
        char[] charArray = sentenceToCheck.toCharArray();
        Set resultSet = new HashSet();

        for (int i = 0; i < sentenceToCheck.length(); i++) {
            resultSet.add(new Character(sentenceToCheck.charAt(i)));
        }

        if (resultSet.size() > 25) {
            return true;
        }

        return false;
    }

}
