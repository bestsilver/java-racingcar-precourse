package racingcar;

public class Round {
    int round;

    public Round(String value) throws IllegalArgumentException {
        if (!checkRoundValidate(value)) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자만 입렵할 수 있습니다.");
        }

        round = Integer.parseInt(value);
    }

    public boolean checkRoundValidate(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
