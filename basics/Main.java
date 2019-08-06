import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args){
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(10);
    clock();
  }

  public static String pluralize(String word, int num){
    String pluralWord = word;
    if(num == 0 || num > 1){
      pluralWord = word + "s";
    }
    return pluralWord;
  }

  public static void flipNHeads(int n){
    int numflips = 0;
    int heads = 0;
    while(heads < n){
      double flip = Math.random();
      numflips++;
      if(flip >= 0.5){
        heads++;
        System.out.println("heads");
      } 
      if(flip < 0.5){
        System.out.println("tails");
      }
    }
    System.out.println("It took " + numflips + " flips to flip " + heads + " heads in a row.");
  }

  public static void clock(){
    int prevSec = 0;
    while(true){
      LocalDateTime now = LocalDateTime.now();
      int sec = now.getSecond();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if(prevSec != sec){
        System.out.println(time); 
        prevSec = sec;
      }
    }
  }
}

