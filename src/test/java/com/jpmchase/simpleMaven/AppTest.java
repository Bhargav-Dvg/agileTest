package com.jpmchase.simpleMaven;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * Unit test for simple App.
 */

@RunWith(Parameterized.class)
public class AppTest 
{
    
    /**
     * Rigourous Test :-)
     * @throws Exception 
     */
    @Test
    public void testApp() throws Exception
    {
        boolean isPalindrome = App.isPalindrome("MADAM");
        Assert.assertTrue(isPalindrome);
    }
    
    @Test
    public void testAppNonPalindrome() throws Exception
    {
        boolean isPalindrome = App.isPalindrome("SOMETEXT");
        Assert.assertFalse(isPalindrome);
    }
    
    @Test(expected=Exception.class)
    public void testNullInput() throws Exception {
    	App.isPalindrome(null);
    }
    
    @Parameters(name="{0} is palindrome test? = {1} ")
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][] {{"madam",true}, {"sometext", false}});
    }
    
    @Parameter(0)
    public String input;
    
    @Parameter(1)
    public boolean expected;
    
    @Test
    public void isPalindromeParameterized() throws Exception {
    	assertThat(App.isPalindrome(input), is(expected));
    }
}
