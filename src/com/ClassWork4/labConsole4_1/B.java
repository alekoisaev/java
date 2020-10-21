package com.classworks.ClassWork4.labConsole4_1;

import java.util.Scanner;

public class B implements B_interface {

    int a = 33;
    double b = 9.7;
    String s = "#";

    @Override
    public void Method_1() {
        System.out.println(s);
    }

    @Override
    public void Method_2() {
        System.out.println(a);
    }

    @Override
    public void Method_3() {
        System.out.println(b);
    }

    @Override
    public void Method_4() {
        System.out.println(a-b);
    }

    @Override
    public double Method_5() {
        return a/b;
    }

    @Override
    public void Method_6() {
        a = 42;
        b = 10.5;
        s = "jvm";
    }

    @Override
    public void Method_7() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter new int: ");
        a = s.nextInt();
    }

    @Override
    public void Method_8() {
        System.out.println(b+10);
    }

}
