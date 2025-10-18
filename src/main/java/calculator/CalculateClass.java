package calculator;

import java.util.ArrayList;

public class CalculateClass {
    private SeparatorClass separatorClass;

    public CalculateClass(SeparatorClass separatorClass) {
        this.separatorClass = separatorClass;
    }

    public int calculate(String input) {
        String[] numberList;
        ArrayList<String> separatorList = separatorClass.getSeparator();

        //구분자가 하나 = 커스텀 구분자
        if (separatorList.size() == 1) {
            numberList = input.substring(input.indexOf("\\n") + 2).split(separatorList.getFirst());
            return getResult(numberList);
        } else {
            numberList = input.split("[,:]");
            return getResult(numberList);
        }
    }

    private int getResult(String[] numberList) {
        if (numberList.length == 0) return 0;
        int sum = 0;
        for (String num : numberList) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
