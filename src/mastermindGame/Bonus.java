package mastermindGame;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Bonus {

    public static void main(String[] args) {

        HashSet<Integer> secretnumber = new HashSet<>();
        randomnumbergenerator(secretnumber);
        // as objects are passed by reference any operation
        String stringNumber = setToStringConverter(secretnumber);
        System.out.println("In case you likes to cheat in the game " + stringNumber); //in case you likes to cheat in the game and for testing purposes
        feedback(stringNumber);
    }

    public static void randomnumbergenerator(HashSet<Integer> randomNumbersSet) {
        Random randomNumGenerator = new Random();
        while (randomNumbersSet.size() < 4) {
            randomNumbersSet.add((Integer) randomNumGenerator.nextInt(9));
        }
    }

    public static String setToStringConverter(HashSet<Integer> randomNumbersSet) {
        String numString = new String("");
        for (Integer num : randomNumbersSet) {
            numString += num.toString();
        }
        return numString;
    }

    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                //Logic is the same
                //if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                if (guess.charAt(i) == stringnumber.charAt(i)) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
