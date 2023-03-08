package org.example;

public class Main implements TempI{

    public void method(int n)
    {
        if (n % 2 == 0)
            System.out.println("geeksforgeeks");
        else
            System.out.println("GEEKSFORGEEKS");
    }
    public static void main(String[] args) {
        TempI in1 = new Main();
        TempI in2 = new Main();
        in1.method(4);
        in2.method(3);
    }
}