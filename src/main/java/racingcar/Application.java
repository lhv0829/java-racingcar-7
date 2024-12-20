package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분. 중복 불가)");
        String carNames = Console.readLine();
        System.out.println("시도할 횟수는 몇 회인가요?");
        String roundNumber = Console.readLine();

        Input input = new Input(carNames, roundNumber);
        Racing racing;

        Util.throwExceptionInputIsNotValid(input.getCarNames(), input.getRounds(), input.splitCarNameInput());
        
        racing = new Racing(input.splitCarNameInput());
        racing.runAllRound(Integer.parseInt(input.getRounds()));
        racing.getWinner();

    }
}
