package CoinChange;

import java.util.Arrays;
import java.util.*;

public class main {

    public static void main(String[] args) {

        int sum = 4;
        ArrayList<Integer> userCoins = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 2, 3));
        ArrayList<Integer> partial = new ArrayList<>();

        calculateCoins.calculate(sum, userCoins, partial);
        calculateCoins.result();
    }
}

