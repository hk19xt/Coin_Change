package CoinChange;

import java.util.Arrays;
import java.util.*;

public class main {

    public static void main(String[] args) {


        // **** open scanner ****
        Scanner sc = new Scanner(System.in);

        // **** read the coin denominations ****
        String[] denominations = sc.nextLine().trim().split(",");

        // **** read the amount ****
        int amount = Integer.parseInt(sc.nextLine().trim());

        // **** close scanner ****
        sc.close();

        // *** convert denomination string to integer ****
        int coins[] = new int[denominations.length];
        calculateCoins c = new calculateCoins();
        for (int i = 0; i < coins.length; i++)
            coins[i] = Integer.parseInt(denominations[i]);

        // **** display the parameters for the function ****
        System.out.println("main <<<  coins: " + Arrays.toString(coins));
        System.out.println("main <<< amount: " + amount);

        // **** process the data and display results ****
        System.out.println("main <<<  coinChange: " + c(Arrays.toString(coins), amount));
    }
}
