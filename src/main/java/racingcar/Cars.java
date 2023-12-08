package racingcar;

import static racingcar.Car.CAR_NAMES_RE_REQUEST_MESSAGE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        validateCarNamesDuplication(cars);
        this.cars = cars;
    }

    private void validateCarNamesDuplication(List<Car> cars) {
        Set<String> carNameChecker = new HashSet<>();

        for (Car car : cars) {
            carNameChecker.add(car.getName());
        }
        if (carNameChecker.size() != cars.size()) {
            throw new IllegalArgumentException(CAR_NAMES_RE_REQUEST_MESSAGE);
        }
    }

    public List<String> findWinners() {
        List<String> winners = new ArrayList<>();
        Car maxDistanceCar = findMaxDistanceCar();

        for (Car car : cars) {
            if (car.isSameDistance(maxDistanceCar)) {
                winners.add(car.getName());
            }
        }

        return winners;
    }

    private Car findMaxDistanceCar() {
        Collections.sort(cars);

        return cars.get(0);
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
