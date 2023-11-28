import java.util.HashMap;

public class Translator {
   public Translator(Integer[] numeric, String[] alphabetic){
       setMapInitialValues(numeric,alphabetic);
   }
    HashMap<Integer, String> numericAlphabeticMap = new HashMap<>();

    private void setMapInitialValues(Integer[] numeric,String[] alphabetic) {
        for(Integer i : numeric){
            numericAlphabeticMap.put(numeric[i],alphabetic[i]);
        }
    }
    public String translate(int num){
        return numericAlphabeticMap.get((Integer)num);
    }
}
