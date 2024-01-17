/**
 * 
 */
package primenumberidentification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author nhasa
 *
 */
public class PrimeNumberIdentification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String Str = "/dfdf/242/dfd/53/fdkf/3/dfjdkfj/45/3/5/6";
        String[] splittedstr= Str.split("/");
        List<String> number = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        for(int i=0;i<splittedstr.length;i++){
            String tmp = splittedstr[i];
            if(tmp.length()!=0) {
                char[] tmpchar = tmp.toCharArray();
                if (Character.isDigit(tmpchar[0])) {
                    number.add(tmp);
                }
            }
        }

        for(int i=0;i<number.size();i++){
            num.add(Integer.parseInt(number.get(i)));
        }
        List sortnum = num.stream().sorted().collect(Collectors.toList());
        int counter = 0;
        int limit = (int) sortnum.get(sortnum.size()-1);
        for(int i=0;i<sortnum.size();i++){
             int val = (int) sortnum.get(i);
             for(int k=1;k<=limit;k++)
             {
                 if(val%k==0)
                 {
                     counter++;
                 }
             }

             if(counter==2)
             {
                 System.out.println("Prime Number:"+val);
             }
            else
            {
                System.out.println("Not Prime Number:"+val);
            }
            counter=0;
        }

	}
}
