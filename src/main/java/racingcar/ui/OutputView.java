package racingcar.ui;

import static racingcar.Converter.DELIMITER;

import java.util.List;
import racingcar.Car;
import racingcar.Converter;

public class OutputView {
    public static final String COLON = " : ";
    public static final String ENTER = "\n";
    public static final String WINNER_MESSAGE = "최종 우승자";

    public static void printGameResult(Car car, List<String> distance) {
        String convertedDistance = Converter.convertDistance(distance);
        System.out.println(car.getName() + COLON + convertedDistance);
    }

    public static void printWinners(List<Car> winners) {
        System.out.print(ENTER);
        String winnersConvention = String.join(DELIMITER, Converter.convertWinners(winners));
        System.out.println(WINNER_MESSAGE + COLON + winnersConvention);
    }
}
