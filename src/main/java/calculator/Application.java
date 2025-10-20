package calculator;

public class Application {
    public static void main(String[] args) {
        SeparatorClass separatorClass = new SeparatorClass();
        InputClass inputClass = new InputClass(separatorClass);
        CalculateClass calculateClass = new CalculateClass(separatorClass);

        //입력 받기
        String input = inputClass.getInput();

        //계산하기
        int result = calculateClass.calculate(input);
        System.out.print("결과 : " + result);
    }
}


