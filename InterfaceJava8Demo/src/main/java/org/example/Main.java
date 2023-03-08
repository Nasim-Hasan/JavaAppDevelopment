package org.example;

public class Main implements TempI {

    @Override
    public void div(int a, int b)
    {
        System.out.print("Answer by Abstract method = ");
        System.out.println(a / b);
    }
    public static void main(String[] args) {
        TempI in = new Main();
        in.div(8, 2);
        in.add(3, 1);
        TempI.mul(4, 1);
    }
}