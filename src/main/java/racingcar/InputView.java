package racingcar;

import static racingcar.Round.ROUND_NUMBER_RE_REQUEST_MESSAGE;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String CAR_NAME_REQUEST_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ROUND_NUMBER_REQUEST_MESSAGE = "시도할 회수는 몇회인가요?";

    public static Cars InputCars() {
        try {
            return readCarNames();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return InputCars();
        }
    }

    private static Cars readCarNames() {
        System.out.println(CAR_NAME_REQUEST_MESSAGE);

        String carNames = Console.readLine();

        return new Cars(Converter.convertCarNames(carNames));
    }

    public static Round InputRound() {
        try {
            return readRound();
        } catch (IllegalArgumentException e) {
            System.out.println(ROUND_NUMBER_RE_REQUEST_MESSAGE);
            return InputRound();
        }
    }

    private static Round readRound() {
        System.out.println(ROUND_NUMBER_REQUEST_MESSAGE);

        String roundRead = Console.readLine();

        return new Round(Converter.convertRound(roundRead));
    }
}
