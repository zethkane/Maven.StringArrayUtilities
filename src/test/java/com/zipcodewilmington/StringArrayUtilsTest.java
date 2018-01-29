package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtilsTest {
    private static final String[] testArray = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};

    @Test
    public void testContains() {
        for (String s : testArray) {
            boolean outcome = StringArrayUtils.contains(testArray, s);
            Assert.assertTrue(outcome);
        }
    }

    @Test
    public void testRemoveValue() {
        String[] expected = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(expected, "The");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue1() {
        String[] expected = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(expected, "quick");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue2() {
        String[] expected = {"the", "quick", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(expected, "brown");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfOccurrences1() {
        int expected = 2;
        int actual = StringArrayUtils.getNumberOfOccurrences(testArray, "the");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfOccurrences2() {
        int expected = 1;
        int actual = StringArrayUtils.getNumberOfOccurrences(testArray, "quick");
        Assert.assertEquals(expected, actual);
    }
}
