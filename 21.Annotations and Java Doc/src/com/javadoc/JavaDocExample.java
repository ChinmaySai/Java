package com.javadoc;
/**
 * This is Sample class to show Demo about
 * Java Documentation
 * 
 * <p>
 * This is Example Paragraph inside the <b>Java Documentation </b>
 * </p>
 * @see Integer
 * @author Chinmay
 * @since 1.0
 *  
 */

public class JavaDocExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * This method takes two {@code int} numbers as input
	 * and returns the sum
	 * 
	 *  <p>
	 *  <b>2+3=5</b>
	 *  </p>
	 * @param num1 represents First number
	 * @param num2 represents Second Number
	 * @return Sum of First and Second Number
	 * 
	 * @throws Exception if the input does not match
	 */
	public  int add1(int num1,int num2)throws Exception
	{
		return num1+num2;
	}

}
