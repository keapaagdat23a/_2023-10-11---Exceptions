package demo.throwexceptiondemo;

public class BadCodePracticeDemo {
  public static void main(String[] args) {
    int number = 0;
    while(true) { // WHAT DEFINITELY N*O*T TO DO!
      System.out.println(++number);
      if (number > 10)
        break; // WHAT DEFINITELY N*O*T TO DO!
    }

    number = 0;
    for(;;) { // WHAT DEFINITELY N*O*T TO DO!
      System.out.println(number++);
      if (number > 10)
        System.exit(1); // WHAT DEFINITELY N*O*T TO DO!
    }
  }
}
