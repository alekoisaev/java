import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    // input num1
    System.out.println("Enter A num: ");
    int num1 = myObj.nextInt();
    // input num2
    System.out.println("Enter B num: ");
    int num2 = myObj.nextInt();

    //print
    System.out.println("A divide B: " + (num1 / num2));
    System.out.println("B divide A(nashti): " + (num2 % num1));
  }
}
