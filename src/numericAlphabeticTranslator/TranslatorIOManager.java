package numericAlphabeticTranslator;

import java.util.Scanner;

// Sometimes I refer to translating as playing they are all the same action
// so PlayAgain also means Translate Again
public class TranslatorIOManager {
    private int num = 0;
    private String name = "zero";
    private Translator numbersTranslator = new Translator();

    //default construct
    public TranslatorIOManager() {
    }

    //method description: asks the user if he wants to play again/translate again another number
    //displays the input message and gets the users choice
    // returns True (play again) or false (dont play again)
    public Boolean playAgain() {
        printPlayingMessages();
        return getUserPlayChoice();
    }

    //function description: where the actual processing happens
    //passes on the user input to the numbersTranslator object and shows the result by calling
    //printTranslationResult() method
    public void getNumberName(int num) {
        this.num = num;
        this.name = numbersTranslator.translate(num);
        printTranslationResult();
    }

    //method description: gets the correct numeric number from the user and validate
    //that it's within right range
    public int getNumInput() {
        Scanner input = new Scanner(System.in);
        int num;
        boolean correctNumber;
        do {
            printNumbersRangeMessage();
            num = input.nextInt();
            correctNumber = checkNumberInRange(num);
        } while (!correctNumber);
        return num;
    }

    //method description:
    private void printNumbersRangeMessage() {
        System.out.println("Plz enter a number between 0 and 9");
    }

    //assuming numbers range from 0-9
    private boolean checkNumberInRange(int num) {
        if (num < 0 || num > 9)
            return false;
        else
            return true;
    }

    //play again user input method
    //if user presses 'x' (small letter x) it means he wants to quit playing/translating
    private boolean getUserPlayChoice() {
        Scanner input = new Scanner(System.in);

        String choice = input.nextLine();
        return choice.equals("x"); // true if it's x (Which means quiting the main loop)
    }

    //method description: prints the final result message
    public void printTranslationResult() {
        System.out.println("De vertaling van " + num + " is " + name);
    }

    //method description: prints the play again messages
    public void printPlayingMessages() {
        System.out.println("Do you wanna play?");
        System.out.println("press x to quit");
        System.out.println("anything else to play");
    }
}
