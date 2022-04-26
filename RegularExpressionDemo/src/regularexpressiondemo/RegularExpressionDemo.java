/**
 * 
 */
package regularexpressiondemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author nhasa
 *
 */
public class RegularExpressionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//...Capturing Groups....//
		// String to be scanned to find the pattern.
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(.*)(\\d+)(.*)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	      }else {
	         System.out.println("NO MATCH");
	      }
		
		//...Start & End Methods...//
	      String REGEX = "\\bcat\\b";
	      String INPUT = "cat cat cat cattie cat";
	      
	      Pattern p = Pattern.compile(REGEX);
	      Matcher m1 = p.matcher(INPUT);   // get a matcher object
	      int count = 0;

	      while(m1.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m1.start());
	         System.out.println("end(): "+m1.end());
	      }
	      
	     //...Matching & LookingAt Methods...//
	      String REGEX1 = "foo";
	      String INPUT1 = "fooooooooooooooooo";
	      Pattern pattern1;
	      Matcher matcher;
	      
	      pattern1 = Pattern.compile(REGEX1);
	      matcher = pattern1.matcher(INPUT1);

	      System.out.println("Current REGEX is: "+REGEX1);
	      System.out.println("Current INPUT is: "+INPUT1);

	      System.out.println("lookingAt(): "+matcher.lookingAt());
	      System.out.println("matches(): "+matcher.matches());
	      
	      //..Replace First and Replace All Methods...//
	      String REGEX2 = "dog";
	      String INPUT2 = "The dog says meow. " + "All dogs say meow.";
	      String REPLACE = "cat";
	      
	      Pattern pattern2 = Pattern.compile(REGEX2);
	      
	      // get a matcher object
	      Matcher m2 = pattern2.matcher(INPUT2); 
	      INPUT2 = m2.replaceAll(REPLACE);
	      System.out.println(INPUT2);
	      
	    //..Append Replacement and Append Tail Methods...//
	      String REGEX3 = "a*b";
	      String INPUT3 = "aabfooaabfooabfoob";
	      String REPLACE1 = "-";
	      
	      Pattern pattern3 = Pattern.compile(REGEX3);
	      
	      // get a matcher object
	      Matcher m3 = pattern3.matcher(INPUT3);
	      StringBuffer sb = new StringBuffer();
	      while(m3.find()) {
	         m3.appendReplacement(sb, REPLACE1);
	      }
	      m3.appendTail(sb);
	      System.out.println(sb.toString());

	}

}
