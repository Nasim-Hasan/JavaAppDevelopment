public class Main {
    public static void main(String[] args) {
        String demo1 = "Banana,Mango,Orange";
        String demo2 = "BananaMangoOrange";

        String[] splitteddemo1 = demo1.split(",");
        String[] splitteddemo2 = demo2.split(",");

        System.out.println("Size of the splitteddemo1:"+splitteddemo1.length);
        System.out.println("Size of the splitteddemo2:"+splitteddemo2.length);

        for(int i=0;i<splitteddemo1.length;i++){
            System.out.println("Value of Splitted Demo1:"+splitteddemo1[i]);
        }
        for(int i=0;i<splitteddemo2.length;i++){
            System.out.println("Value of Splitted Demo2:"+splitteddemo2[i]);
        }
    }
}