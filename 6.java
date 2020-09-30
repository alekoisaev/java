import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int m, n, sum = 0;

    //input num
    System.out.println("Enter Num: ");
    m = input.nextInt();

    //while loop
    while(m > 0)
    {
      n = m % 10;
      sum = sum + n;
      m = m / 10;
    }
    System.out.println("Sum:" + sum);
  }
}
