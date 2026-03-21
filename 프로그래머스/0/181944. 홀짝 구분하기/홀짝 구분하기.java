import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a%2==0){
      System.out.printf("%d is even", a);
    }
    else {
      System.out.printf("%d is odd", a);
    }
  }
}