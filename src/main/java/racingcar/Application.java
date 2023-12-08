package racingcar;

public class Application {
    public static void main(String[] args) {
        Cars cars = InputView.InputCars();
        Round round = InputView.InputRound();

        Race race = new Race();
        race.run(cars, round);
    }
}
