package calculator;

import static java.lang.Character.isDigit;

public class SeparatorClass {

    private final String separators;

    public SeparatorClass(String input) {
        if (input.startsWith("//")) {
            int endIndex = input.indexOf("\\n");
            if (endIndex == -1) {
                throw new IllegalArgumentException("구분자 업데이트가 불가능합니다.");
            }
            //업데이트 로직
            this.separators = input.substring(2, endIndex);
        } else if (!input.isEmpty() && !isDigit(input.charAt(0))) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        } else {
            this.separators = "[,:]";
        }
    }

    public String getSeparators() {
        return separators;
    }
}
