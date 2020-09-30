import java.util.Scanner;

class GCD {
    public static void main(String[] args)
      {
      Scanner s = new Scanner(System.in);

      int a = s.nextInt();
      int b = s.nextInt();
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        System.out.println(a);
    }
}
