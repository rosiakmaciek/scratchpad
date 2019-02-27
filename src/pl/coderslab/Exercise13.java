package pl.coderslab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise13 {

    public static void main(String[] args) {

        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");

        System.out.println(countSmileys(a));

    }

    public static int countSmileys(List<String> arr) {

        if (arr == null) {
            return 0;
        }
        int correctFaces = 0;

        String[] corrects = {":)", ";)", ":D", ";D", ":-)", ";-)", ":-D", ";-D", ":~)", ";~)", ":~D", ";~D"};

        List<String> corrList = Arrays.asList(corrects);

        for(String face : arr) {
            if(corrList.contains(face)) {
                correctFaces++;
            }
        }

        return correctFaces;
    }

}