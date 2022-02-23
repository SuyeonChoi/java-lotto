package lotterymachine.model;

import java.util.Arrays;

public enum WinningLottery {
    THREE(3, 5000),
    FOUR(4, 50000),
    FIVE(5, 150000),
    BONUS_FIVE(5, 30000000),
    SIX(6, 2000000000);

    private final int number;
    private final int price;

    WinningLottery(int number, int price) {
        this.number = number;
        this.price = price;
    }

    public static WinningLottery find(int number) {
        return Arrays.stream(values())
                .filter(value -> value.matchNumber(number))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(""));
    }

    private boolean matchNumber(int number) {
        return this.number == number;
    }
}