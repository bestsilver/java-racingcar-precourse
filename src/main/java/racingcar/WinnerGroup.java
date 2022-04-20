package racingcar;

public class WinnerGroup {
    CarGroup winnerGroup = new CarGroup();
    int distance = 0;

    public static final String WINNER_SEPARATOR = ", ";

    public WinnerGroup(CarGroup group) {
        for (Car car : group.getCarGroup()) {
            setWinnerGroup(car);
        }
    }

    public int compareDistance(int a, int b) {
        return Integer.compare(a, b);
    }

    private void setWinnerGroup(Car car) {
        int compared = compareDistance(car.distance, this.distance);

        if (compared > 0) {
            winnerGroup.resetCarGroup();
        }

        if (compared >= 0) {
            winnerGroup.appendCar(car);
            this.distance = car.distance;
        }
    }

    public String printWinnerGroup() {
        StringBuilder winners = new StringBuilder();

        for (Car car : winnerGroup.getCarGroup()) {
            winners.append(car.name.getCarName());
            winners.append(WINNER_SEPARATOR);
        }

        return winners.delete(winners.lastIndexOf(WINNER_SEPARATOR), winners.length() - 1).toString();
    }
}
