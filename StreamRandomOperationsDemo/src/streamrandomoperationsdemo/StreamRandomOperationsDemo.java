/**
 * 
 */
package streamrandomoperationsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author nhasa
 *
 */
public class StreamRandomOperationsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    List<String> grades= Arrays.asList(new String[]{"A","B","C","D"});
	        List student = grades.stream().filter(s->s.equalsIgnoreCase("B"))
	                .collect(Collectors.toList());
	        System.out.println(student);

	        List<String> Department = Arrays.asList(new String[]{"CSE","CSE","EEE","ME"});
	        List<Integer> Age = Arrays.asList(new Integer[]{12,45,28,15});
	        List<Integer> Salary = Arrays.asList(new Integer[]{4000,6000,7000,1000});

	        List DepartmentList = Department.stream().filter(s->s.equalsIgnoreCase("CSE")).collect(Collectors.toList());
	        List AgeList = Age.stream().filter(s->s>=28).collect(Collectors.toList());
	        List SalaryList = Salary.stream().filter(s->s>=4000).collect(Collectors.toList());

	        System.out.println(DepartmentList);
	        System.out.println(AgeList);
	        System.out.println(SalaryList);

	}

}
