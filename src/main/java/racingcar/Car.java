package racingcar;

public class Car {
    public static String CAR_NAMES_RE_REQUEST_MESSAGE = "자동차 이름을 다시 입력해 주십시오.";
    private static final int CAN_NAME_LENGTH_MAXIMUM_LIMIT = 5;

    private final String name;

    public Car(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    private void validateCarNameLength(String name) {
        if (name.length() > CAN_NAME_LENGTH_MAXIMUM_LIMIT) {
            throw new IllegalArgumentException(CAR_NAMES_RE_REQUEST_MESSAGE);
        }
    }
}
