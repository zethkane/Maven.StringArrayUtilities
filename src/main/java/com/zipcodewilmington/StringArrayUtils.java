package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {


        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean yes= false;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(value))
            {
                yes = true;
            }

        }return yes;

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       int count = 0;
        String [] arr = new String[array.length];
        for (int i = array.length - 1; i>=0; i--) {
            String position = array[i];
            arr[count] = position;
            count++;
        }

        return arr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array)
    {
        int count = 0;
       boolean palindromic = true;
        for(int i = array.length - 1; i >= 0;  i--){
            if (array[i].equals(array[count])){
                palindromic = true;

            }
            else{ palindromic = false;
            i =+ -1;
            }count++;

        }


        return palindromic;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array)
    {
       /* char[] theBit = new char[]{ 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String arr = "";
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            arr += array[i];
        }
        for (int i = 0; i < arr.length(); i++)
        {
          if( arr.charAt(i) == theBit.charAt(0) && arr.charAt(i) <= 'z')
          {
              count++;
          }
        }*/




        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (value.equals(array[i]))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       int index = 0;
       for (int i = 0; i < array.length; i++)
       {
           if (array[i] != valueToRemove)
           {
               array[index++] = array[i];
           }
       }


        return Arrays.copyOf(array, index);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array)
    {


        int index = array.length;
        int counter = 0;
        int k = 0;

        for (int i = array.length - 1; i > 0; i--)
        {
            if (array[i] != null && array[i].equals(array[i-1]))
                {
                   array[i] = null;
                    counter++;
                }

        }
        String[] result = new String[array.length - counter];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != (null))
            {
                result[k] = array[i];
                k++;

            }

        }



        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        int index = array.length;
        int counter = 0;
        int k = 0;

        for (int i = array.length - 1; i > 0; i--)
        {
            if (array[i] != null && array[i].charAt(0) == array[i-1].charAt(0))
            {
                array[i - 1] += array[i];
                array[i] = null;
                counter++;
            }

        }
        String[] result = new String[array.length - counter];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != (null))
            {
                result[k] = array[i];
                k++;

            }

        }



        return result;
    }


}
