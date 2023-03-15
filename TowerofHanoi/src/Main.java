import java.util.Scanner;

public class Main {

   public static void towerofHanoi(int n, char from_rod, char to_rod, char helper_rod){

       if(n==1){
           System.out.println("The Disk:"+n+"moved from"+from_rod+"to"+to_rod);
           return;
       }
       towerofHanoi(n-1,from_rod,helper_rod,to_rod);
       System.out.println("The Disk:"+n+"moved from"+from_rod+"to"+to_rod);
       towerofHanoi(n-1,helper_rod,to_rod,from_rod);
   }
   public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Input the Number of Disks:");

        n= obj.nextInt();
        towerofHanoi(n,'A','C','B');

   }
}