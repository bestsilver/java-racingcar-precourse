package racingcar;

public class CarName {
    public static final int MAX_NAME = 5;
    public static final int MIN_NAME = 1;

    private final String carName;

    public CarName(String value) throws IllegalArgumentException {
        validateCarName(value);
        carName = value;
    }

    public void validateCarName(String value) throws IllegalArgumentException {
        boolean isValid = checkCarNameMax(value) && checkCarNameMin(value);
    }

    private boolean checkCarNameMax(String value) throws IllegalArgumentException {
        if (value.length() > MAX_NAME) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하여야 합니다.");
        }

        return true;
    }

    private boolean checkCarNameMin(String value) throws IllegalArgumentException {
        if (value.length() < MIN_NAME) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 1자 이상이여야 합니다.");
        }

        return true;
    }

    public String getCarName() {
        return carName;
    }
}
