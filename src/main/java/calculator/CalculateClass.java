package calculator;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class CalculateClass {
    private SeparatorClass separatorClass;

    public CalculateClass(SeparatorClass separatorClass) {
        this.separatorClass = separatorClass;
    }

    public int calculate(String input) {
        String[] numberList;
        String separators = separatorClass.getSeparators();

        //구분자가 하나 = 커스텀 구분자
        if (separators.equals("[,:]")) {
            Pattern pattern = Pattern.compile(separators);
            numberList = pattern.split(input);
            return getResult(numberList);

        } else {
            numberList = input.substring(input.indexOf("\\n") + 2).split(separators);
            return getResult(numberList);
        }
    }

    private int getResult(String[] numberList) {
        if (numberList[0].isEmpty()) return 0;
        int sum = 0;
        for (String num : numberList) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
