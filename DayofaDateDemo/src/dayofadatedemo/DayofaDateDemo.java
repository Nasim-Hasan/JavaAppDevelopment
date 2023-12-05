/**
 * 
 */
package dayofadatedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;





/**
 * @author nhasa
 *
 */
public class DayofaDateDemo {

	/**
	 * @param args
	 */
	 public static String findDayName(int month, int day, int year) {
	        String output = "";

	        //First we are going to create a calendar object and get the todays date from it.
	        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	        Calendar cal = Calendar.getInstance();
	        Date date = cal.getTime();
	        
	        //Then get the todays date as string
	        String todaysdate = dateFormat.format(date);
	        
	        //Find the differance between today and the target date
	        long differance = findDifferanceDays(todaysdate, day+"-"+month+"-"+year);

	        //find the mod of the differance
	        differance = differance % 7;
	        //then go to near day to the target date which at same day as today
	        while(differance < 0){
	            differance +=7;
	        }

	        //find the day name with rest of day count
	        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) -1;

	        String[] days 
	            = { 
	            "SUNDAY",
	            "MONDAY", 
	            "TUESDAY", 
	            "WEDNESDAY",
	            "THURSDAY",
	            "FRIDAY",
	            "SATURDAY",
	            "SUNDAY",
	            "MONDAY", 
	            "TUESDAY", 
	            "WEDNESDAY",
	            "THURSDAY",
	            "FRIDAY",
	            "SATURDAY" };

	        if(differance > 0) output = days[dayOfWeek + (int)differance];
	        else  output = days[dayOfWeek ];

	        //return the day name
	        return output;
	    }
	
	
	 static long findDifferanceDays(String start, String end) 
	    { 
	        long diff = 0;
	        //create the date format
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
	  
	        try { 
	            //convert them the date objects
	            Date date_start = sdf.parse(start); 
	            Date date_end = sdf.parse(end); 
	            //find the differance between dates
	            long diff_Time = date_end.getTime() - date_start.getTime(); 
	            //find the time as days
	            diff  = (diff_Time / (1000 * 60 * 60 * 24)) ; 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
	        //return it
	        return diff;
	    } 

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("Day Name :" + findDayName(11, 30, 2019));
        System.out.println("Day Name :" + findDayName(11, 30, 2018));
        System.out.println("Day Name :" + findDayName(11, 30, 2029));
        System.out.println("Day Name :" + findDayName(11, 20, 2119));
        System.out.println("Day Name :" + findDayName(05, 30, 2019));
        System.out.println("Day Name :" + findDayName(06, 11, 2019));
        System.out.println("Day Name :" + findDayName(01, 20, 2019));
	}

}
