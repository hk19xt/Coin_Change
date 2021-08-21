package CoinChange;

import java.util.Arrays;
import java.util.*;

public class main {

    public static void main(String[] args) {

        int sum = 4;
        ArrayList<Integer> userCoins = new ArrayList<>(Arrays.asList(1, 2, 1, 1, 3, 1));
        ArrayList<Integer> partial = new ArrayList<>();

        calculateCoins.calculate(sum, userCoins, partial);
        calculateCoins.result();
    }
}

