import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        boolean quitPlay = true;
        do {
            // Hier mag je je code schrijven voor de hoofd-opdracht
            int num = getUsernumInput();
            Integer[] numericNumbers = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            String[] alphabeticNumbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            Translator numbersTranslator = new Translator(numericNumbers, alphabeticNumbers);
            System.out.println("De vertaling van " + num + " is " + numbersTranslator.translate(num));

            System.out.println("Do you wanna play?");
            System.out.println("press x to quit");
            System.out.println("anything else to play");
            quitPlay = getUserchoice();
        } while (!quitPlay);
    }

    private static int getUsernumInput() {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Plz enter a number between 0 and 9");
            num = input.nextInt();
        } while (num < 0 || num > 9);
        return num;
    }

    private static boolean getUserchoice() {
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        return choice.equals("x"); // true if it's x (Which means quiting the main loop)
    }

}
