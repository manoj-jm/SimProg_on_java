import java.util.Scanner;

public class Geuss {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n , g=12;
     System.out.print("enter a target number ");
     do{
       System.out.println("geuss the any number");
       n = in.nextInt();
       if(g > n){
        System.out.println("tooo small ");
       }else if(g<n){
        System.out.println("tooo large");
       }else{
        System.out.println("correct geuss "+ n);
        break;
       }
     }while(true);

  }
}
