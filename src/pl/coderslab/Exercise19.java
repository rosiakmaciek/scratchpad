package pl.coderslab;

public class Exercise19 {

    public static void main(String[] args) {

        System.out.println(makeReadable(359999));

    }

    public static String makeReadable(int seconds) {

        int sec;
        int min;
        int hours;

        String s;
        String m;
        String h;

        min = seconds / 60;
        sec = seconds - min * 60;

        hours = min / 60;
        min = min - hours * 60;

        if(hours < 10) {
            h = "0" + hours + ":";
        } else {
            h = hours + ":";
        }

        if(min < 10) {
            m = "0" + min + ":";
        } else {
            m = min + ":";
        }

        if(sec < 10) {
            s = "0" + sec;
        } else {
            s = sec + "";
        }

        return h + m + s;
    }

}
