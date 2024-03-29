/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.*;

public class Library {

  public static void main(String[] args){
    List<String> votes = new ArrayList<>();
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Bush");
    votes.add("Shrub");
    votes.add("Hedge");
    votes.add("Shrub");
    votes.add("Bush");
    votes.add("Hedge");
    votes.add("Bush");

    String winner = tally(votes);
    System.out.println(winner + " received the most votes!");
  }

  public static int[] roll(int n) {
    int[] rolls = new int[n];
    for(int i = 0; i < n; i++){
      rolls[i] = (int)((Math.random() * 6) + 1);
    }
    return rolls;
  }

  public static boolean containsDuplicates(int[] arr){
    for(int j = 0; j < arr.length; j++){
      for(int k = 1; k < arr.length; k++){
        if(arr[j] == arr[k] && j != k) return true;
      }
    }
    return false;
  }

  public static double calculateAvg(int[] arr){
    double sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum/arr.length;
  }

  public static String arrayAvgValue(int[][] arr){
    ArrayList<Integer> averages = new ArrayList<>();
    int lowestAvg = Integer.MAX_VALUE;
    int lowestAvgIndex = 0;
    int avg = 0;
    for(int i = 0; i < arr.length; i++){
      int sum = 0;
      for(int j = 0; j < arr[i].length; j++){
        sum += arr[i][j];
        avg = sum/arr[i].length;
      }
      averages.add(avg);
    }

    for(int k = 0; k < averages.size(); k++){
      if(averages.get(k) < lowestAvg){
        lowestAvg = averages.get(k);
        lowestAvgIndex = k;
      }
    }
    return Arrays.toString(arr[lowestAvgIndex]);
  }

  public static void analyzeWeatherdata(int[][] arr){
    int high = Integer.MIN_VALUE;
    int low = Integer.MAX_VALUE;
    String msg = "Never saw temperature: ";
    HashSet<Integer> uniqueTemps = new HashSet<>();
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        uniqueTemps.add(arr[i][j]);
        if(arr[i][j] < low) low = arr[i][j];
        if(arr[i][j] > high) high = arr[i][j];
      }
    }
    System.out.println("High: " + high);
    System.out.println("Low: " + low);

    for(int k = low; k < high; k++){
      if(!uniqueTemps.contains(k)){
        System.out.println(msg + k);
      }
    }
  }

  public static String tally(List<String> votes){
    HashMap<String, Integer> candidates = new HashMap<>();
    int count = 0;
    String winner = "";
    for(String name : votes){
      candidates.put(name, 0);
    }

    for(String name : votes){
      if(candidates.get(name) > count){
        count = candidates.get(name) + 1;
        winner = name;
      }
      else {
        candidates.put(name, candidates.get(name) + 1);
      }
    }
    return winner;
  }

}

