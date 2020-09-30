import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    // input num1
    System.out.println("Enter A num: ");
    int num1 = myObj.nextInt();

    //print
    System.out.println((num1 / 1000) + ((num1 % 1000) / 100) + ((num1 % 100) / 10) + (num1 % 10));
  }
}
