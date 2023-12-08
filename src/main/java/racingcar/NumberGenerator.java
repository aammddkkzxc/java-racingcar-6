package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class NumberGenerator {
    private static final int NUMBER_MINIMUM_VALUE = 0;
    private static final int NUMBER_MAXIMUM_VALUE = 9;

    public static int generate() {
        return Randoms.pickNumberInRange(NUMBER_MINIMUM_VALUE, NUMBER_MAXIMUM_VALUE);
    }
}
