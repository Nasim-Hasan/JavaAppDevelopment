import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        a = input.nextInt();
        if (a==2){
           System.out.println("If Block Executed");
        }
        if(a==3){
            System.out.println("Else If Block Executed");
        }
        else{
            System.out.println("Else Block Executed");
        }
    }
}