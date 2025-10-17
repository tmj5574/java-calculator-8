package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputClass {
    //input을 받기
    private String input;

    public String getInput(){
        this.input = Console.readLine();
        return input;
    }
}
