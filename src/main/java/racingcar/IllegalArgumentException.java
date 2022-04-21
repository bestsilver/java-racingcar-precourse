package racingcar;

public class IllegalArgumentException extends RuntimeException{
    public static final String MAX_LENGTH_CAR_NAME_ERROR_MSG = "[ERROR] 자동차 이름은 5자 이하여야 합니다.";
    public static final String MIN_LENGTH_CAR_NAME_ERROR_MSG = "[ERROR] 자동차 이름은 1자 이상이여야 합니다.";
    public static final String NOT_NUMBER_ERROR_MSG = "[ERROR] 시도 횟수는 숫자만 입렵할 수 있습니다.";

    public IllegalArgumentException(final String errorMessage) {super(errorMessage);}
}
