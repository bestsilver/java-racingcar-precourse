package racingcar;

public class CarName {
    public static final int MAX_NAME = 5;
    public static final int MIN_NAME = 1;

    private String carName;

    public CarName(String value) throws IllegalArgumentException {
        validateCarName(value);
        carName = value;
    }

    public void validateCarName(String value) throws IllegalArgumentException {
        boolean isValid = checkCarNameMax(value) && checkCarNameMin(value);
    }

    private boolean checkCarNameMax(String value) throws IllegalArgumentException {
        if (value.length() > MAX_NAME) {
            throw new IllegalArgumentException(IllegalArgumentException.MAX_LENGTH_CAR_NAME_ERROR_MSG);
        }

        return true;
    }

    private boolean checkCarNameMin(String value) throws IllegalArgumentException {
        if (value.length() < MIN_NAME) {
            throw new IllegalArgumentException(IllegalArgumentException.MIN_LENGTH_CAR_NAME_ERROR_MSG);
        }

        return true;
    }

    public String getCarName() {
        return carName;
    }
}
