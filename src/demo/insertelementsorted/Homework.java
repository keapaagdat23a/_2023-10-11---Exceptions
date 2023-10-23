package demo.insertelementsorted;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Homework {
  private ArrayList<Assignment> assignments;
  public final int NUMBER_OF_ASSIGNMENTS = 10000;

  public static void main(String[] args) {
    new Homework().run();
  }

  private void run() {
    assignments = new ArrayList<>();
    generateRandomAssignmentList();
    printAssignmentList();
  }

  private void printAssignmentList() {
    for (Assignment a : assignments) {
      System.out.println(a.getDeadline() + ": " + a.getName());
    }
  }

  private void generateRandomAssignmentList() {
    for (int i = 0; i < NUMBER_OF_ASSIGNMENTS; i++) {
      LocalDateTime timestamp = generateRandomDeadline();
      String name = generateRandomName();
      Assignment a = new Assignment(timestamp, name);
      // addAssignmentAtEndOfList(a);
      addAssignmentSortedByDeadline(a);
    }
  }

  private void addAssignmentSortedByDeadline(Assignment a) {
    int index = 0;
    while (index < assignments.size() && a.getDeadline().isAfter(assignments.get(index).getDeadline()))
      index++;
    assignments.add(index, a);
  }

  private void addAssignmentAtEndOfList(Assignment a) {
    assignments.add(a);
  }

  private String generateRandomName() {
    Random random = new Random();
    String[] courses = {"Programming", "System development", "Organization", "Technology"};
    String[] assignmentTypes = {"Solve assignment", "Prepare presentation", "Study curriculum",
        "Solve challenge", "Project work"};

    String course = courses[random.nextInt(courses.length)];
    String assignmentType = assignmentTypes[random.nextInt(assignmentTypes.length)];

    return course + ": " + assignmentType + ", page " + (random.nextInt(1100) + 100);
  }

  private LocalDateTime generateRandomDeadline() {
    int year, month, day, hour, minute;
    Random random = new Random();

    year = random.nextBoolean() ? LocalDateTime.now().getYear() : LocalDateTime.now().getYear() + 1;
    month = random.nextInt(12) + 1;
    day = random.nextInt(28) + 1; // Don't wanna deal with longer/shorter months here
    hour = random.nextInt(8) + 8;
    minute = random.nextInt(4) * 15;

    return LocalDateTime.of(year, month, day, hour, minute);
  }
}
