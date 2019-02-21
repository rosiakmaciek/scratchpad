package pl.coderslab;

public class Exercise9 {

    public static void main(String[] args) {

        System.out.println(isValid("(("));

    }

    public static boolean isValid(String braces) {

        // without any imports

        Character[] openers = {'(', '{', '['};
        Character[] closers = {')', '}', ']'};

        char[] bracesArray = braces.toCharArray();

        if (braces.length() % 2 != 0) {
            return false;
        }

        for (char startChar : closers) {
            if (startChar == bracesArray[0]) {
                return false;
            }
        }

        for (int i = 0; i < bracesArray.length; i++) {

            if (bracesArray.length == 2) {
                for (int b = 0; b < 2; b++) {
                    if (openers[b] == bracesArray[0]) {
                        if (closers[b] == bracesArray[1]) {
                            return true;
                        }
                    }
                }

            }

            for (int j = 0; j < closers.length; j++) {

                if (bracesArray[i] == closers[j]) {

                    if (bracesArray[i - 1] == openers[j]) {
                        bracesArray[i] = '_';
                        bracesArray[i - 1] = '_';
                    } else {
                        return false;
                    }

                    if (bracesArray.length == 2) {
                        return true;
                    } else {

                        char[] tempArray = new char[bracesArray.length - 2];
                        int container = 0;

                        for (int a = 0; a < bracesArray.length; a++) {

                            if (bracesArray[a] != '_') {
                                tempArray[a - container] = bracesArray[a];
                            } else {
                                container++;
                            }
                        }

                        bracesArray = tempArray;
                        i = 0;
                    }
                }
            }
        }

        return false;
    }

}


//"[({})](]" =>  False