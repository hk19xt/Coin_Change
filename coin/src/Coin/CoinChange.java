package Coin;

import java.util.*;


public class CoinChange {

    static Map<Integer, ArrayList<ArrayList<Integer>>> resultArrays = new HashMap<>();

    public static void result() {

        resultArrays.forEach((key, value) -> {
            System.out.println("Your sum is " + key );
            System.out.println("Coin change results: ");

            for (int i = 0; i < value.size(); i++) {
                System.out.println(value.get(i) + " ");
            }
        });
    }


    private static void finalResult(ArrayList<Integer> finalArray) {
        int sum = 0;
        boolean bool = false;
        for(int i=0; i<finalArray.size();i++){
            sum += finalArray.get(i);
        }
        int userSum = sum;
        ArrayList<ArrayList<Integer>> inProgress = resultArrays.get(userSum);
        if (inProgress.contains(finalArray)==bool) {
            inProgress.add(finalArray);
            resultArrays.put(userSum, inProgress);
        }
    }

    public static void calculation(ArrayList<Integer> coins, int userSum, ArrayList<Integer> inProgress) {

        if (coins.size() == 0) {
            System.out.println("There is no input.");
            return;
        }
        double coinSum = 0;
        for(int i=0; i<coins.size();i++){
            coinSum += coins.get(i);
        }
        if (userSum > coinSum) {
            System.out.println("The coins should be larger than the userSum.");
            return;
        }

        if (userSum == 0) {
            System.out.println("The userSum is zero. Please change the userSum you would like to change.");
            return;
        }

        int minimumCoin = Collections.min(coins);
        if (userSum < minimumCoin) {
            System.out.println("The userSum should be larger than the smallest input.");
            return;
        }



        ArrayList<ArrayList<Integer>> arrayList = resultArrays.get(userSum);
        int empty = 0;

        if (inProgress.size() == empty && arrayList == null) {
            arrayList = new ArrayList<>();
            resultArrays.put(userSum, arrayList);
        }

        for (Integer aCoin : coins) {
           // System.out.println(aCoin);
            ArrayList<Integer> finalArray = new ArrayList<>(inProgress);
            finalArray.add(aCoin);

            Collections.sort(finalArray);



            ArrayList<Integer> coinsSublist = new ArrayList<>(coins);
            coinsSublist.remove(aCoin);

            if (userSum < aCoin) {

                calculation(coinsSublist, userSum, inProgress);
                continue;
            }

            ArrayList<Integer> inProgressAdded = new ArrayList<>(inProgress);

            if (userSum > aCoin) {

                inProgressAdded.add(aCoin);
                calculation( coinsSublist, userSum - aCoin, inProgressAdded);
                continue;
            }

            if (userSum == aCoin) {

                finalResult(finalArray);
                continue;
            }


        }

    }



}
