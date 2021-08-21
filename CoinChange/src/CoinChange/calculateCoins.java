package CoinChange;

import java.util.*;

public class calculateCoins {
   public static Map<Integer, ArrayList<ArrayList<Integer>> > calculate = new HashMap<>();

   private static void calculate(int sum, ArrayList<Integer> userCoins, ArrayList<Integer> partial){
      boolean bool = false;
      int empty = 0;
      if(bool){
         System.out.println();
      }

      if(userCoins.size()==empty){
         System.out.println("There is no coins.");
         return;
      }

      if(sum>userCoins.stream().mapToInt(coins->coins.intValue()).sum()){
         System.out.println("The sum should be larger than the sum of all coins. ");
         return;
      }
      if(sum==empty){
            System.out.println("User didn't put the sum.");
            return;
         }
      if(sum<userCoins.stream().min(Integer::compare).get()){
         System.out.println("The sum should be larger than the smallest coin.");
         return;
      }

      ArrayList<ArrayList<Integer>> calculation = calculate.get(sum);
      if(calculation==null && partial.size()==empty){
         calculation = new ArrayList<>();
         calculate.put(sum, calculation);
      }

      for(Integer aCoin : userCoins){
         ArrayList<Integer> array = new ArrayList<>(partial);
         array.add(aCoin);
         array.sort(Integer::compare);

         ArrayList<Integer> reducedArray = new ArrayList<>(userCoins);
         reducedArray.remove(aCoin);
         ArrayList<Integer> partialArrays = new ArrayList<>(partial);

         if(sum==aCoin){
            finalSolution(array,0);
            continue;
         }
      }



   }
   private static void finalSolution(ArrayList<Integer> finalSolution, int partial){
      int
   }

}
