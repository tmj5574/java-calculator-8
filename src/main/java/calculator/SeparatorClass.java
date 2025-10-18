package calculator;

import java.util.ArrayList;
import java.util.List;

public class SeparatorClass {

    private ArrayList<String> separator = new ArrayList<String>(List.of(",", ":"));

    public void updateSeparator(String input){
        if(!input.contains("\\n")){
            return;
        }
        separator.clear();
        separator.add(input.substring(2,input.indexOf("\\n")));
    }

    public ArrayList<String> getSeparator() {
        return separator;
    }
}
