package Coin;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sum = 4;
        ArrayList<Integer> inProgressArray = new ArrayList<>();
        ArrayList<Integer> userInputs = new ArrayList<>(Arrays.asList(1, 2, 1, 1, 3, 1, 1));
        CoinChange.calculation(userInputs, sum, inProgressArray);
        CoinChange.result();
    }
}


