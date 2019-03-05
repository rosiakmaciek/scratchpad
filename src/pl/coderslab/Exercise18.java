package pl.coderslab;

import java.util.Arrays;
import java.util.List;

public class Exercise18 {

    public static void main(String[] args) {

        String test = "https://codewars.com/kata/563fbac924106b8bf7000046/train/java";
        System.out.println(generate_bc(test, ":"));

    }

    public static String generate_bc(String url, String separator) {

        StringBuilder sb = new StringBuilder();
        StringBuilder second = new StringBuilder();

        String[] illegals = {"the", "of", "in", "from", "by", "with", "and", "or", "for", "to", "at", "a"};
        List<String> illegalsList = Arrays.asList(illegals);

        String[] splitted = url.split("[#?]");
        String urlToConsider = splitted[0];

        boolean flag = true;
        while (flag) {
            if (urlToConsider.charAt(0) == '/') {
                urlToConsider = urlToConsider.substring(1, urlToConsider.length() - 1);
            } else {
                flag = false;
            }
        }

        try {
            int wwwAppearance = urlToConsider.indexOf("www");
            urlToConsider = urlToConsider.substring(wwwAppearance);
        } catch (Exception e) {

        }

        try {
            int slicerAppearance = urlToConsider.indexOf("//");
            urlToConsider = urlToConsider.substring(slicerAppearance + 2);
        } catch (Exception e) {

        }

        String[] myParts = urlToConsider.split("/");

        try {
            if (myParts[myParts.length - 1].substring(0, 5).equalsIgnoreCase("index")) {
                myParts = Arrays.copyOf(myParts, myParts.length - 1);
            }
        } catch (Exception e) {

        }

        if (myParts.length == 1) {

            return "<span class=\"active\">HOME</span>";
        }

        sb.append("<a href=\"/\">HOME</a>");

        for (int i = 1; i < myParts.length; i++) {

            String toPutHere = "";
            second.append("/").append(myParts[i]);

            if (myParts[i].length() > 30) {
                String[] localParts = myParts[i].split("-");
                for (String oneString : localParts) {
                    if (!illegalsList.contains(oneString)) {
                        toPutHere += String.valueOf(oneString.charAt(0)).toUpperCase();
                    }
                }

            } else {

                String[] current = myParts[i].split("-");

                if (current.length > 1) {
                    char[] charArray = myParts[i].toCharArray();
                    for (int j = 0; j < charArray.length; j++) {
                        if (charArray[j] == '-') {
                            charArray[j] = ' ';
                        }
                    }
                    toPutHere = new String(charArray).toUpperCase();
                } else {
                    toPutHere = myParts[i].toUpperCase();
                }
            }

            if (i < myParts.length - 1) {

                String here = second.toString().substring(1);

                sb.append("" + separator + "" + "<a href=\"/").append(here).append("/\">").append(toPutHere).append("</a>");
            } else {

                String[] lastChopToPut = toPutHere.split("[.]");
                toPutHere = lastChopToPut[0];

                sb.append("" + separator + "" + "<span class=\"active\">").append(toPutHere).append("</span>");
            }

        }

        return sb.toString();
    }

}
