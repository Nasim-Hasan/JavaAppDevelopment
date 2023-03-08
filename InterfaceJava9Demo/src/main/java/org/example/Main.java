package org.example;

public class Main implements TempI{

    @Override
    public void mul(int a, int b)
    {
        System.out.print("Answer by Abstract method = ");
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        TempI in = new Main();
        in.mul(2, 3);
        in.add(6, 2);
        TempI.mod(5, 3);
    }
}