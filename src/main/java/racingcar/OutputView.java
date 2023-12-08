package racingcar;

public class OutputView {
    private static final String RESULT_MESSAGE = "실행 결과";

    public static void printRoundResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + " : " + car.getDistance());
        }
    }
}
