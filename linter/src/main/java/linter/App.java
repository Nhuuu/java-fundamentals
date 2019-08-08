/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    File path = new File("./src/main/resources/gates.js");
    getGates(path);
  }


  public static void getGates(File path){
    Scanner s = null;
    int line = 0;
    try{
      s = new Scanner(new BufferedReader(new FileReader(path)));
      while(s.hasNext()){
        line++;
        if(!s.nextLine().endsWith(";") && !s.nextLine().isEmpty() && !s.nextLine().endsWith("{") && !s.nextLine().endsWith("}") && !s.nextLine().contains("if") && !s.nextLine().contains("else")){
          System.out.println("Line " + line + ": Missing semicolon.");
        }
      }
    } catch(FileNotFoundException e){
      System.out.println("file not found");
    }
  }
}
