package numericAlphabeticTranslator;

public class RunManager {
   // private String numName;
    private int num;
    TranslatorIOManager userInputs = new TranslatorIOManager();
    public void runTranslator(){
        boolean quitPlay;
        do {
            num = userInputs.getNumInput();
            userInputs.getNumberName(num);
            quitPlay = userInputs.playAgain();
        } while (!quitPlay);
    }
}
