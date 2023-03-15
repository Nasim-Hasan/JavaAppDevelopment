public class Main {


    public static boolean isBracketBalanced(String exp){

        char[] Stack = new char[exp.length()];
        char[] expression = exp.toCharArray();
        int stackindex=-1;

        if(exp.isEmpty()||exp.isBlank())
        {
            return false;
        }
        else{
             for(int i=0;i<expression.length;i++)
             {
                 if(expression[i]=='('||expression[i]=='{'||expression[i]=='['){
                     stackindex++;
                     Stack[stackindex] = expression[i];
                 }
                 else{
                        if(stackindex<0)
                        {
                            return false;
                        }
                        char tmp = Stack[stackindex];

                        if(tmp=='('&& expression[i]==')')
                        {
                            Stack[stackindex] = '\0';
                            stackindex--;

                        }
                        else if(tmp=='{'&& expression[i]=='}'){

                            Stack[stackindex] = '\0';
                            stackindex--;


                        }
                        else if(tmp=='['&& expression[i]==']'){

                            Stack[stackindex] = '\0';
                            stackindex--;


                        }
                 }
             }
        }

        if(stackindex<0)
        {
            stackindex=0;
        }

        if(Stack[stackindex]=='\0')
        {
            return true;
        }

          return false;
    }

    public static void main(String[] args) {
        String exp = "[{(})]";
        if(isBracketBalanced(exp))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }
    }
}