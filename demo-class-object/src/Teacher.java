public class Teacher {
  private Candy2[] candies; // object reference
  private Student2[] students; // object reference

  public Teacher(Candy2[] candies, Student2[] students) {
    this.candies = candies;
    this.students = students;
  }

  public static boolean shouldDistribute(int score, char color) {
    return score >= 80 && color == 'R'
        || score >= 60 && score < 80 && color == 'B'
        || score < 60 && color == 'Y';
  }

  public void clearCandy(int pos) {
    this.candies[pos] = null;
  }

  // Teacher, Candy2, Student2
  // Rule: Every round of distribution, Above 80 score -> RED; between 60 - 79 score -> BLUE, else
  // YELLOW
  public void distribute() {
      int pos = 0;
      while (true) {
        for (Student2 student : this.students) {
          if (shouldDistribute(student.getScore(), this.candies[pos].getColor())) {
            student.receiveCandy(this.candies[pos]); // student candy bag + 1
            this.clearCandy(pos); // teacher's candy bag - 1
            if (++pos >= this.candies.length)
              return;
          }
        }
      }
  }

  public static void main(String[] args) {
    Candy2[] candies = new Candy2[] {new Candy2('R'), new Candy2('R'),
        new Candy2('R'), new Candy2('Y'), new Candy2('B'), new Candy2('R'),
        new Candy2('Y'), new Candy2('R'), new Candy2('R'), new Candy2('R'),
        new Candy2('R'), new Candy2('B'), new Candy2('B'), new Candy2('R'),
        new Candy2('Y'), new Candy2('Y'), new Candy2('R'), new Candy2('R'),
        new Candy2('R'), new Candy2('B')};
    // System.out.println(candies.length);
    Student2[] students = new Student2[] {new Student2(1L, 67),
        new Student2(2L, 89), new Student2(3L, 50), new Student2(4L, 99),
        new Student2(5L, 60), new Student2(6L, 59)};

    Teacher t1 = new Teacher(candies, students);
    t1.distribute();

    for (Student2 student : students) {
      System.out.println(
          "Student " + student.getId() + "-" + student.getCandiesInfo());
    }



  }
}