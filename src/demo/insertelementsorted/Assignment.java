package demo.insertelementsorted;

import java.time.LocalDateTime;

public class Assignment {
  private final LocalDateTime deadline;
  private final String name;

  public Assignment(LocalDateTime deadline, String name) {
    this.deadline = deadline;
    this.name = name;
  }

  public LocalDateTime getDeadline() {
    return deadline;
  }

  public String getName() {
    return name;
  }
}
