package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Exercise16 {

    public static void main(String[] args) {

        String[] checkArray = {"NORTH", "SOUTH", "EAST", "WEST"};

        for(String towrite : dirReduc(checkArray)) {
            System.out.println(towrite);
        }

        System.out.println(dirReduc(checkArray).length);

    }

    public static String[] dirReduc(String[] arr) {

        List<String> myList = new ArrayList<>();

        int north = 0;
        int south = 0;
        int west = 0;
        int east = 0;

        for (String dir : arr) {
            if (dir.equalsIgnoreCase("north")) {
                north++;
            } else if (dir.equalsIgnoreCase("south")) {
                south++;
            } else if (dir.equalsIgnoreCase("west")) {
                west++;
            } else {
                east++;
            }
        }

        for (String dir : arr) {
            if (dir.equalsIgnoreCase("north")) {
                if (south == 0) {
                    myList.add("NORTH");
                } else {
                    south--;
                }
            } else if (dir.equalsIgnoreCase("south")) {
                if (north == 0) {
                    myList.add("SOUTH");
                } else {
                    north--;
                }
            } else if (dir.equalsIgnoreCase("west")) {
                if (east == 0) {
                    myList.add("WEST");
                } else {
                    east--;
                }
            } else {
                if (west == 0) {
                    myList.add("EAST");
                } else {
                    west--;
                }
            }
        }

        String[] toReturn = new String[myList.size()];
        toReturn = myList.toArray(toReturn);

        return toReturn;
    }

}
