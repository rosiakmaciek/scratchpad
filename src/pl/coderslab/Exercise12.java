package pl.coderslab;

import java.util.LinkedList;

public class Exercise12 {

    public static void main(String[] args) {

        String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

        System.out.println(WhoIsNext(names, 4));

    }

    public static String WhoIsNext(String[] names, int n) {

        LinkedList<String> namesAsList = new LinkedList<>();

        for(int i = 0; i < names.length; i++) {
            namesAsList.add(String.valueOf(i));
        }

        for (int i = 0; i < n - 1; i++) {
            namesAsList.addLast(namesAsList.remove(0));
            namesAsList.addLast(namesAsList.getLast());
        }

        for (String imie : namesAsList) {
            System.out.println(imie);
        }

        return names[Integer.valueOf(namesAsList.get(0))];

    }

}
