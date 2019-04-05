package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class GFG {

    static void printPermutn(String str, String ans, List<String> listToAddTo) {

        if (str.length() == 0) {
            listToAddTo.add(ans);

            String[] myArray = new String[listToAddTo.size()];

            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            printPermutn(ros, ans + ch, new ArrayList<>());
        }
    }

    // Driver code
    public static void main(String[] args) {

        String s = "dupa10";

        List<String> myList = new ArrayList<>();

        printPermutn(s, "", myList);

        myList.add("1");

        myList.add("1");

        for(String element : myList) {
            System.out.println(element);
        }
    }
}