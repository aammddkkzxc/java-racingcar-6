package racingcar;

import static racingcar.Round.ROUND_NUMBER_RE_REQUEST_MESSAGE;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static String CAR_NAME_DELIMITER = ",";

    public static List<Car> convertCarNames(String carNames) {
        String[] separatedCarNames = carNames.split(CAR_NAME_DELIMITER);
        List<Car> cars = new ArrayList<>();

        for (String carName : separatedCarNames) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public static int convertRound(String round) {
        try {
            return Integer.parseInt(round);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ROUND_NUMBER_RE_REQUEST_MESSAGE);
        }
    }
}
