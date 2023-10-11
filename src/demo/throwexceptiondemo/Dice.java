package demo.throwexceptiondemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Dice {
  private int[] dice;

  public Dice(int numberOfDice) throws Exception {
    if (numberOfDice < 1)
      throw new Exception("Please send 1 or above");
    dice = new int[numberOfDice];
  }
}

class TestDice {
  public static void main(String[] args)  {
    try {
      PrintStream ps = new PrintStream(new File(""));

    } catch (FileNotFoundException exception) {
      // throw new RuntimeException(exception.getMessage());
    } catch (NullPointerException exception) {
      System.out.println("null");
    }

    // THIS is what we're looking at:

    if (true)
      else
        ;
    default {
      System.out.println("this");
    }
    try {
      Dice dice = new Dice(-2);
    } catch (Exception e) {
      System.out.println("EXCEPTION: " + e.getMessage());
    } finally {
      System.out.println("Done with the risky business.");
    }
    System.out.println("I'm good!");
  }
}