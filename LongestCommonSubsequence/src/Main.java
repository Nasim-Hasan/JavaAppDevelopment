public class Main {

    public int lcs (String S1, String S2, int m, int n){

        if(m==0 || n==0){
            return  0;
        }
        else if(S1.charAt(m-1)==S2.charAt(n-1))
        {
            return 1+lcs (S1,S2,m-1,n-1);
        }
        else{
             return max(lcs(S1,S2,m-1,n),lcs(S1,S2,m,n-1));
        }

    }

    public int max(int a, int b)
    {
        return (a>b)?a:b;

    }

    public static void main(String[] args) {
        Main obj = new Main();
        String S1 = "AGT";
        String S2 = "BGT";
        int m = S1.length();
        int n = S2.length();

        System.out.println("Length of LCS is" + " " + obj.lcs(S1, S2, m, n));

    }
}