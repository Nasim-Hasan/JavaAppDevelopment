public class Main {

  public static int maxknapSackVal(int C,int[] wt, int[] vl,int l){

      if(l==0 || C==0)
      {
          return 0;
      }
      else if(C<wt[l-1]){
          return maxknapSackVal(C,wt,vl,l-1);
      }
      else{
           int val1 = maxknapSackVal(C-wt[l-1],wt,vl,l-1);
           int val2 = maxknapSackVal(C,wt,vl,l-1);
           return max(vl[l-1]+val1,val2);
      }
  }

   public static int max(int a, int b){

      return (a>b?a:b);
   }

   public static void main(String[] args) {
        // input arrays
        int values[] = new int[] { 100, 60, 120 };
        int weight[] = new int[] { 20, 10, 30 };
        // capacity of the knapsack
        int C = 50;
        // calculating the length
        int length = values.length;
        int maxVal = maxknapSackVal(C, weight, values, length);
        System.out.println("The maximum value is: " + maxVal);

    }
}