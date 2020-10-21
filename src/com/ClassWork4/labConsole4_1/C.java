package com.classworks.ClassWork4.labConsole4_1;

import java.util.Scanner;

public class C implements C_interface{

    int a = 10;
    int b = 9;
    String s="#", h="@";

    @Override
    public void Method_1() {
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    public void Method_2() {
        System.out.println(s);
        System.out.println(h);
    }

    @Override
    public void Method_3() {
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    @Override
    public void Method_4() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter new a: ");
        a = s.nextInt();
    }

    @Override
    public void Method_5() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter new b: ");
        b = s.nextInt();
    }

    @Override
    public void Method_6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter new s: ");
        s = scanner.next();

        System.out.println("Enter new h: ");
        h = scanner.next();
    }

}
