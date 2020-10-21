package com.classworks.ClassWork4.labConsole4_1;

public class A implements A_interface {

    int a=10;
    int b=29;

    @Override
    public void Method_1() {
        System.out.println("Hello OOP");
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
        System.out.println(a+b);
    }

    @Override
    public int Method_5() {
        return a+b;
    }

    @Override
    public int Method_6() {
        return a*b;
    }

    @Override
    public void Method_7() {
        a = 5;
        b = 6;
    }
}
