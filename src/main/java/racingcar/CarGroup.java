package racingcar;

import java.util.ArrayList;
import java.util.Arrays;

public class CarGroup {
    private final ArrayList<Car> carGroup;
    public static final String CARNAME_SEPARATOR = ",";

    public CarGroup() {
        carGroup = new ArrayList<>();
    }

    public CarGroup(String carNames) throws IllegalArgumentException {
        carGroup = new ArrayList<>();

        for (String name : separateCarNames(carNames)) {
            appendCar(new Car(name));
        }
    }

    public ArrayList<String> separateCarNames(String values) {
        return new ArrayList<>(Arrays.asList(values.split(CARNAME_SEPARATOR)));
    }

    public void appendCar(Car car) {
        carGroup.add(car);
    }

    public void resetCarGroup() {
        carGroup.clear();
    }

    public ArrayList<Car> getCarGroup() { return carGroup;}

}
