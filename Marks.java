public class Marks {
  public static void main(String[] args) {
    int marks = 78;
    if (marks > 90) {
      System.out.println("A");
    } else if (marks > 75) {
      System.out.println("B");
    } else if (marks > 60) {
      System.out.println("C");
    } else if (marks > 90) {
      System.out.println("D");
    } else if (marks < 30) {
      System.out.println("F");
    }

    // .Create a program that categorize a person into different age groups
    int age = 74;
    if (age <= 13) {
      System.out.println("child");
    }
    if (age <= 17 && age >= 14) {
      System.out.println("teen");
    }
    if (age < 60 && age >= 18) {
      System.out.println("adult");
    }
    if (age >= 60) {
      System.out.println("Senior");
    }
  }
}

// A -> above 90% B -> above 75%
// C -> above 60% D -> above 30%
// F -> below 30%