package calculator;

public class Application {
    public static void main(String[] args) {
        InputClass inputClass = new InputClass();
        SeparatorClass separatorClass = new SeparatorClass();
        ExceptionClass exceptionClass = new ExceptionClass(separatorClass);
        CalculateClass calculateClass = new CalculateClass(separatorClass);
        //입력 받기
        String input = inputClass.getInput();
        //예외 체크하기
        exceptionClass.checkInput(input);
        //계산하기
        int result = calculateClass.calculate(input);
        System.out.print("결과 : "+result);
    }
}


