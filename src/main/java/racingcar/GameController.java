package racingcar;

public class GameController {
    public static final String CAR_NAMES_INPUT_NOTICE_STR = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ROUND_INPUT_NOTICE_STR = "시도할 회수는 몇회인가요?";
    public static final String RESULT_NOTICE_STR = "실행 결과";

    Round round;
    CarGroup group;

    public GameController() {
        this.group = getValidCarGroup();
        this.round = getValidRound();
    }

    public void run() {
        System.out.println(RESULT_NOTICE_STR);
        for (int i=0; i< round.getRound(); i++) {
            startOneGameRacing();
            System.out.println(group.printGroupByCarScore());
        }

        WinnerGroup winnerGroup = new WinnerGroup(group);
        System.out.println(winnerGroup.printFinalWinnerGroup());
    }

    private void startOneGameRacing() {
        for (Car car: group.getCarGroup()) {
            car.decideMovement();
        }
    }

    private Round getValidRound () {
        boolean isValid;
        String userInput;

        do {
            System.out.println(ROUND_INPUT_NOTICE_STR);
            userInput = UserInputView.getUserInput();
            isValid = checkRoundUserInput(userInput);
        } while (!isValid);

        return new Round(userInput);
    }

    private boolean checkRoundUserInput(String userinput) {
        try {
            new Round(userinput);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private CarGroup getValidCarGroup() {
        boolean isValid;
        String userInput;

        do {
            System.out.println(CAR_NAMES_INPUT_NOTICE_STR);
            userInput = UserInputView.getUserInput();
            isValid = checkCarGroupUserInput(userInput);
        } while (!isValid);

        return new CarGroup(userInput);
    }

    private boolean checkCarGroupUserInput (String userinput) {
        try {
            new CarGroup(userinput);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
