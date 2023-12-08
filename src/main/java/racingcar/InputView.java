package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String CAR_NAME_REQUEST_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static Cars readCarNames() {
        System.out.println(CAR_NAME_REQUEST_MESSAGE);

        String carNames = Console.readLine();
        Cars cars = new Cars(Converter.convertCarNames(Console.readLine()));

        return cars;
    }
}
