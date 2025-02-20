package com.string;

public class StringChallenge2 {

	public static void main(String[] args) {

		//TO check if the Number is Binary or not
		String binaryCheck="01";
         System.out.println("String binaryCheck is Binary  ? :"+binaryCheck.matches("[01]+"));
         //To Check if the String is Hexa-Decimal Format
         String Hexa_decimal="B156";
         System.out.println("String Hexa_decimal is Hexa Decimal  ? :"+Hexa_decimal.matches("[A-F0-9]+"));
         //To Check if the date is in dd/mm/yyyy
         String date="13/02/1999";
         System.out.println("Is this date in dd/mm/yyyy format : "+date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
         
	}

}
