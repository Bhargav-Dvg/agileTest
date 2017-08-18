package com.jpmchase.simpleMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //System.out.println( "Hello World!" );
        isPalindrome("MADAM");
        isPalindrome("TestNonPalindrome");
    }
    
    public static boolean isPalindrome(String inputString) throws Exception {
    	if(inputString == null) {
    		throw new Exception("No input string");
    	}
    	//StringBuffer inputStringBuffer = new StringBuffer(inputString);
    	StringBuffer reversedStringBuff = new StringBuffer(inputString).reverse();
    	
    	if(inputString.equalsIgnoreCase(reversedStringBuff.toString())) {
    		System.out.println(inputString+" is a Palindrome");
    		return true;
    	}
    	else {
    		System.out.println(inputString+" is not a Palindrome");
    		return false;
    	}
    }

    public static boolean isLeap(Integer year) throws Exception {
    	if(year == null) {
    		throw new Exception();
    	}
    	
    	else if(year%4 == 0 && year%100 != 0) {
    		return true;
    	}
    	
    	else if(year%400 == 0) {
    		return true;
    	}
    	
    	return false;
    }
    
}
