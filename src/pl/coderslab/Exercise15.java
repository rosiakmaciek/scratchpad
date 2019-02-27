package pl.coderslab;

public class Exercise15 {

    public static void main(String[] args) {

        System.out.println(zeros(14));

    }

    public static int zeros(int n) {

        int fives = 0;

        for (int i = 5; n / i >= 1; i *= 5)
            fives += n / i;

        return fives;
    }

}
