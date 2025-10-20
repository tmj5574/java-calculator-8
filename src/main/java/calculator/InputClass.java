package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputClass {

    private SeparatorClass separatorClass;

    public InputClass(SeparatorClass separatorClass) {
        this.separatorClass = separatorClass;
    }

    public String getInput() {
        String input = Console.readLine();
        checkInput(input);
        return input;
    }

    private void checkInput(String input) {
        //1번째 글자가 양의 정수인지 확인
        if (input.isEmpty() || Character.isDigit(input.charAt(0))) {
            return;
        } else if (input.startsWith("//")) {
            //구분자 업데이트
            separatorClass.updateSeparator(input);
            return;
        }
        throw new IllegalArgumentException("잘못된 입력입니다.");
    }
}
