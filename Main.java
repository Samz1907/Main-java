import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

Scanner s = new Scanner(System.in);
 System.out.println("enter first number");

    int a = s.nextInt();
    System.out.println("enter the second number");
int b = s.nextInt();
System.out.println("enter the third number");
int c = s.nextInt();

if (a>b) {
  
 if (a>c) {
  System.out.println("a is greater than b and c");
 }
  else{
    System.out.println("c is greater than b1");
  }
  
}
else{

if (b<c) {
  System.out.println("b is greater than a and c");
}
else{
  System.out.println("c is greater than a and b");
}
}




     }
}