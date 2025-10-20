package calculator;

public class Application {
    public static void main(String[] args) {
        InputClass inputClass = new InputClass();
        //입력 받기
        String input = inputClass.getInput();

        SeparatorClass separatorClass = new SeparatorClass(input);
        CalculateClass calculateClass = new CalculateClass(separatorClass);

        //계산하기
        int result = calculateClass.calculate(input);
        System.out.print("결과 : " + result);
    }
}


