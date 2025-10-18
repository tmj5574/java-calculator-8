package calculator;

public class ExceptionClass {
    private SeparatorClass separatorClass;

    public ExceptionClass(SeparatorClass separatorClass) {
        this.separatorClass = separatorClass;
    }

    public void checkInput(String input) {
        if (input.isEmpty() || input == null) throwException("입력이 비어 있습니다.");
        //1번째 글자가 양의 정수인지 확인
        if (Character.isDigit(input.charAt(0))) {
            return;
        } else if (input.startsWith("//")) {
            //구분자 업데이트
            separatorClass.updateSeparator(input);
            return;
        }
        throwException("잘못된 입력입니다.");
    }

    private void throwException(String text) {
        throw new IllegalArgumentException(text);
    }
}
