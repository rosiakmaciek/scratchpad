package pl.coderslab;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.HashSet;
import java.util.Set;

public class Exercise17 {

    public static void main(String[] args) {

        String toTest = "?*11=??";
        System.out.println(solveExpression(toTest));

    }

    public static int solveExpression(final String expression) {

        // działa ale tylko dla dodatnich, trzeba wymyślić coś na minusowe, moze execute na StringBuilderze

        String[] parts = expression.split("=");
        String L = parts[0];
        String P = parts[1];

        Set<Character> knownCharacters = new HashSet<>();

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        for (int i = 0; i < expression.length(); i++) {
            knownCharacters.add(expression.charAt(i));
        }

        try {

            for (int j = 0; j < 10; j++) {

                char[] LArray = L.toCharArray();
                char[] PArray = P.toCharArray();
                char toPut = Character.forDigit(j, 10);

                for (int i = 0; i < LArray.length; i++) {
                    if (LArray[i] == '?') {
                        LArray[i] = toPut;
                    }
                }

                for (int i = 0; i < PArray.length; i++) {
                    if (PArray[i] == '?') {
                        PArray[i] = toPut;
                    }
                }

                String lSum = new String(LArray);
                String pSum = new String(PArray);

                if (engine.eval(lSum).equals(engine.eval(pSum)) && LArray[0] != '0' && PArray[0] != '0' && !knownCharacters.contains(toPut) && !knownCharacters.contains(toPut)) {
                    return j;
                }

            }

        } catch (Exception e) {

        }

        return -1;
    }

}
