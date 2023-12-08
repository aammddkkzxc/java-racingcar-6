package racingcar;

public class Race {
    public void run(Cars cars, Round round) {
        for(int i = 0; i < round.getNumber(); i++) {
            for(Car car : cars.getCars()) {
                car.move(NumberGenerator.generate());
            }
        }
    }
}
