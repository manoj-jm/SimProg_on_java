import java.util.Scanner;

public class PassWrd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean flag = false;
    System.out.println(
        "The criteria for a valid password. \nIt might need to be a certain length(8)\ncontain a mix of uppercase and lowercase letters \nInclude numbers or special characters.");
    String Special_Char = "!@#$%^&*()-_+=[]{}|;:,.<>?";
    // System.out.println(pssWrd.);
    do {
      System.out.println("enter a password");
      String pssWrd = in.nextLine();
      if (pssWrd.length() >= 8) {
        for (char ch : pssWrd.toCharArray()) {
          if (Character.isUpperCase(ch)) {// to check atleast one uppercase
            flag = true;
            break;
          } else {
            flag = false;
            break;
          }
        }

        for (char ch : pssWrd.toCharArray()) {
          if (Special_Char.indexOf(ch) != -1) {// to check one special character
            flag = true;
            break;
          } else {
            flag = false;
          }
        }

      } else {
        flag = false;
      }

      if (flag) {
        System.out.println("valid password !");
      } else {
        System.out.println("Invalid password ! try again ");
      }

    } while (flag == false);
  }
}
