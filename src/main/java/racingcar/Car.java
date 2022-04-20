package racingcar;
import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    public static final String SCORE_SHAPE = "-";
    public static final int MIN_PICK_NUMBER = 0;
    public static final int MAX_PICK_NUMBER = 9;
    public static final int MIN_FORWARD = 4;

    CarName name;
    int distance;

    public Car(String name) throws IllegalArgumentException {
        this.name = new CarName(name);
        this.distance = 0;
    }

    public void decideMovement() {
        int randomNumber = Randoms.pickNumberInRange(MIN_PICK_NUMBER, MAX_PICK_NUMBER);

        if (randomNumber >= MIN_FORWARD) {
            this.move();
        }
    }

    private void move() { distance++; }

    public String printCarScore() {
        StringBuilder scoreboard = new StringBuilder();
        for (int i=0; i < distance; i++) {
            scoreboard.append(SCORE_SHAPE);
        }
        return name.getCarName() + " : " + scoreboard;
    }
}
