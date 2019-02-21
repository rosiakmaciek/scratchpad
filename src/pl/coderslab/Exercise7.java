package pl.coderslab;

public class Exercise7 {

    public static void main(String[] args) {

        String[] a1 = {"arp", "live", "strong", "arp"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};

        String[] r = inArray(a1, a2);

        for (String str : r) {
            System.out.println(str);
        }

    }

    public static String[] inArray(String[] array1, String[] array2) {

        boolean contains = false;
        boolean doubled = false;

        String[] listToDimnish = new String[array1.length];

        for (int i = 0; i < array1.length; i++) {
            for (String ar2 : array2) {
                if (ar2.contains(array1[i])) {
                    contains = true;
                }
            }
            if (contains) {
                for (String str : listToDimnish) {
                    if (str.equals(array1[i])) {
                        doubled = true;
                    }
                }

                if (!doubled) {
                    listToDimnish[i] = array1[i];
                }

            }
            contains = false;
            doubled = false;
        }

        int arraySize = 0;

        for (String stringToCheck : listToDimnish) {
            if (stringToCheck != null) {
                arraySize++;
            }
        }

        String[] r = new String[arraySize];
        for (int i = 0; i < r.length; i++) {
            r[i] = listToDimnish[i];
        }

        return r;
    }

}

//Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of
// a1 which are substrings of strings of a2.
//
//#Example 1: a1 = ["arp", "live", "strong"]
//
//a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//returns ["arp", "live", "strong"]
//
//#Example 2: a1 = ["tarp", "mice", "bull"]
//
//a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
//
//returns []