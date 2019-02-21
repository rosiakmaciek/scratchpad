package pl.coderslab;

public class Exercise5 {

    public static void main(String[] args) {

        System.out.println(calculateYears(1000.00, 0.01625, 0.18, 1200.00));

    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {

        double sumNow = principal;
        int years = 0;

        while(sumNow < desired) {

            double sumBeforeTax = sumNow;
            sumNow = sumNow * (1 + interest);
            double taxToReturn = (sumNow - sumBeforeTax)*tax;
            sumNow -= taxToReturn;

            years++;
        }

        return years;

    }

}
