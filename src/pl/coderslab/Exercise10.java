package pl.coderslab;

public class Exercise10 {

    public static void main(String[] args) {

        System.out.println(duplicateCount("abbaqwer"));

    }

    public static int duplicateCount(String text) {

        int repetitions = 0;
        int localRep = -1;

        char[] charArr = text.toLowerCase().toCharArray();
        for (int i = 0; i < charArr.length; i++) {

            char currentChar = charArr[i];

            if (currentChar != '_') {
                for(int j = 0; j < charArr.length; j++) {
                    if(currentChar == charArr[j]) {
                        charArr[j] = '_';
                        localRep++;
                    }
                }
            }

            if(localRep > 0) {
                repetitions++;
            }
            localRep = -1;
        }

        return repetitions;
    }

}
