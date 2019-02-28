package pl.coderslab;

public class OCEX3 {

    public static void main(String[] args) {

        String toCheck = "111";
        System.out.println(solution(toCheck));

    }

    public static int solution(String S) {

        int sInDecimal = Integer.parseInt(S, 2);
        int counter = 0;

        do {

            if (sInDecimal % 2 == 0) {
                sInDecimal /= 2;
            } else {
                sInDecimal -= 1;
            }

            counter++;

        } while (sInDecimal != 0);

        return counter;

    }

}