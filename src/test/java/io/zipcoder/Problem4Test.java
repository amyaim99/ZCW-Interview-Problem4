package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Problem4Test {
    Problem4 problem4 = new Problem4();
    @Test
    public void isPalindromTest() throws Exception {

        Boolean expected = true;
        Boolean expected2 = false;

        Boolean actual = problem4.isPalindrome("cabac");
        Boolean actual2 = problem4.isPalindrome("abac");


        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringtoCharArrayTest() throws Exception {

        int expected = 5;
        int expected2 = 2;

        int actual = problem4.stringtoCharArray("cabac").size();
         int actual2 = problem4.stringtoCharArray("ab").size();


       Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isAnagramTest() throws Exception {

        Boolean expected = true;
        Boolean expected2 = false;

        Boolean actual = problem4.isAnagramTest("cabac", "cabac");
        Boolean actual2 = problem4.isAnagramTest("abd", "ba");


        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected, actual);

    }

    @Test

    public void subStringsFromStringTest(){

        int expected =5;
        int actual = problem4.getSubstringFromAString("abc").size();

        Assert.assertEquals(expected,actual);

    }

    @Test

    public void checkIfAStringHasAPalindonAndANagramTest(){

        String expected2 = "YES";
        String expected = "NO";
        String actual = problem4.checkIfAStringHasAPalindonAndANagram("cdefghmnopqrstuvw");
        String actual2 = problem4.checkIfAStringHasAPalindonAndANagram("aaabbbb");


        Assert.assertEquals(expected2, actual2);
         Assert.assertEquals(expected, actual);
    }

}