package numericAlphabeticTranslator;

import java.util.HashMap;

public class Translator {

    //default values
    private Integer[] numericNums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private String[] alphabeticNums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    // a map where to set the numeric numbers and its equivalent alphabetic number
    //initially empty
    private HashMap<Integer, String> numericAlphabeticMap = new HashMap<>();
    //initial constructor using default Numeric/Alphabetical numbers (0-9)
    public Translator() {
        //initializing the values in the num./alpha. map
        setMapInitialValues(numericNums, alphabeticNums);
    }

    //This constructor is implemented bc it was asked for in the opdracht :)
    // (referring to stappenplan nummers 2 & 3)

    //it can also be used if we would like to expand the translator to accept
    // a different set of numbers other than the exercise default (from 0-9)
    // creating a map for different numeric numbers and its equivalent alphabetical number
    public Translator(Integer[] numeric, String[] alphabetic) {
        setMapInitialValues(numeric, alphabetic);
    }

    //assuming that the Integer array and alphabetic array are of the same size
    // and each Integer array element has its equivalent name
    // // in the same position in the String array
    private void setMapInitialValues(Integer[] numeric, String[] alphabetic) {
        for (Integer i : numeric) {
            numericAlphabeticMap.put(numeric[i], alphabetic[i]);
        }
    }

    // method input: a numeric number
    //method output: its equivalent value in the map
    public String translate(int num) {
        return numericAlphabeticMap.get((Integer) num);
    }
}
