package calculator;

import java.util.ArrayList;
import java.util.List;

public class SeparatorClass {

    private ArrayList<String> separator = new ArrayList<String>(List.of(",", ":"));

    private ExceptionClass exceptionClass;

    public SeparatorClass(ExceptionClass exceptionClass) {
        this.exceptionClass = exceptionClass;
    }

    public void updateSeparator(String input) {
        if (!input.contains("\\n")) {
            exceptionClass.throwException("잘못된 입력입니다.");
        }
        separator.clear();
        separator.add(input.substring(2, input.indexOf("\\n")));
    }

    public ArrayList<String> getSeparator() {
        return separator;
    }
}
