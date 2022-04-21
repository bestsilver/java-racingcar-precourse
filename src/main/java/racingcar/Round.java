package racingcar;

public class Round {
    private int round;

    public Round(String value) throws IllegalArgumentException {
        if (!checkRoundValidate(value)) {
            throw new IllegalArgumentException(IllegalArgumentException.NOT_NUMBER_ERROR_MSG);
        }

        round = Integer.parseInt(value);
    }

    private boolean checkRoundValidate(String value) throws IllegalArgumentException {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int getRound() {
        return round;
    }
}
