package pl.coderslab;

public class Exercise4 {

    public static void main(String[] args) {

        System.out.println(Tickets(new int[] {25, 100}));

    }

    public static String Tickets(int[] peopleInLine) {

        int quaterCounter = 0;
        int halfCounter = 0;
        int wholeCounter = 0;

        for (int person : peopleInLine) {
            if (person == 100) {
                wholeCounter++;
                if(halfCounter > 0) {
                    halfCounter--;
                    quaterCounter--;
                } else {
                    quaterCounter = quaterCounter - 3;
                }
                if(quaterCounter < 0) {
                    return "NO";
                }
            } else if (person == 50) {
                halfCounter++;
                quaterCounter--;
                if(quaterCounter < 0) {
                    return "NO";
                }
            } else {
                quaterCounter++;
            }

        }

        return "YES";
    }

}
