import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Hier mag je je code schrijven voor de hoofd-opdracht

        HashMap<Integer, String> numericAlphabeticMap = new HashMap<>();
        setMapInitialValues(numericAlphabeticMap);



    }

    private static void setMapInitialValues(HashMap<Integer, String> numericAlphabeticMap) {

        numericAlphabeticMap.put(0,"zero");
        numericAlphabeticMap.put(1,"one");
        numericAlphabeticMap.put(2,"two");
        numericAlphabeticMap.put(3,"three");
        numericAlphabeticMap.put(4,"four");
        numericAlphabeticMap.put(5,"five");
        numericAlphabeticMap.put(6,"six");
        numericAlphabeticMap.put(7,"seven");
        numericAlphabeticMap.put(8,"eight");
        numericAlphabeticMap.put(9,"nine");
    }
}
