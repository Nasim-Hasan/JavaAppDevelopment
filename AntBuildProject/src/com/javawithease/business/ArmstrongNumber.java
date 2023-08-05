package com.javawithease.business;
/**
 * This program is used to find that given number is Armstrong or not.
 * @author javawithease
 */
public class ArmstrongNumber {
	/**
	 * This method is used to find that given number is Armstrong or not.
	 * @param num
	 */
	static void armstrong(int num){
		int newNum = 0, reminder, temp;
		temp = num;
		//find sum of all digit's cube of the number.
		while(temp != 0){
			reminder = temp % 10;
			newNum = newNum + reminder*reminder*reminder;
			temp = temp/10;
		}
		//Check if sum of all digit's cube of the number is 
		//equal to the given number or not.
		if(newNum == num){
			System.out.println("Given no. is an armstrong no.");
		}else{
			System.out.println("Given no. is not an armstrong no.");
		}
	}
	
	public static void main(String args[]){
		//method call
		armstrong(407);
		
	}
}
