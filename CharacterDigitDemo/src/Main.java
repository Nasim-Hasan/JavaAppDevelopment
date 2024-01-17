public class Main {
    public static void main(String[] args) {
        String Str="\\ABcdEFgh\\12\\UTR12";
        String[] splittedstring = Str.split("\\\\");
        for(int i=0;i<splittedstring.length;i++){
            String tmp = splittedstring[i];
            if(tmp.length()!=0){
                char[] tmpchar=tmp.toCharArray();
                for(int k=0;k<tmpchar.length;k++){
                    if(Character.isDigit(tmpchar[k])){
                        System.out.println("String Contains a Digit:"+tmp);
                    }
                }
            }
        }

    }
}