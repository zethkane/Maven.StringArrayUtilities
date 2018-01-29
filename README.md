## Building Utility Class for String Array Objects
* **Objective**
    * Ensure [StringArrayUtilsTest](https://github.com/Zipcoder/CR-MicroLabs-Arrays-StringArrayUtilities/blob/master/src/test/java/com/zipcodewilmington/StringArrayUtilsTest.java) passes each test by completing the utility methods in the class [StringArrayUtils](https://github.com/Zipcoder/CR-MicroLabs-Arrays-StringArrayUtilities/blob/master/src/main/java/com/zipcodewilmington/StringArrayUtils.java)
        * `int getNumberOfOccurrences(String[] stringArray, String stringToCheck)`
        * `boolean contains(String[] stringArray, String stringToCheck)`
        * `String[] removeValue(String[] stringArray, String stringToRemove)`
        
* **Purpose**
    * To establish greater familiarity with loops and arrays.
    * To demonstrate the implementation of a [Utility class](https://www.quora.com/What-is-a-utility-class)
    
    







<br><br><br><br>
## Sample Behavior<br> `StringArrayUtils.removeValues(array, valueToRemove)`
* **Description**
    * Given an array of `String` objects named `array` and a `String` object named `valueToRemove`<br>create and return an array containing identical contents excluding objects whose value is equivalent to `valueToRemove`. Ensure that the length of the newly created array has been resized based on the removal of the undesired elements. 
        
### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeValues(array, "aba");
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [baa, bab, bba, bba, bba, bba, bbb, bbb};
    ```
    
    

### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeValues(array, "bba");
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aba, aba, baa, bab, bbb, bbb];
    ```
    
    

### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    String[] actual = StringArrayUtils.removeValues(array, "bbb");
    
    // : Then
    System.out.println(Arrays.toString(actual));
    ```



* Sample Output
    ```
    [aba, aba, baa, bab, bba, bba, bba, bba];
    ```















<br><br><br><br>
## Sample Behavior<br> `StringArrayUtils.getNumberOfOccurrences(array, value)`
* **Method Description**
    * Given an array of `String` objects named `array` and a `String` object named `value`<br>return the number of times `value` appears in `arrays`

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    int numberOfOccurrences = StringArrayUtils.getNumberOfOccurrences(array, "bba");
    
    // : Then
    System.out.println(numberOfOccurrences);
    ```



* Sample Output

    ```
    4
    ```
    
    
    

### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    int numberOfOccurrences = StringArrayUtils.getNumberOfOccurrences(array, "bbb");
    
    // : Then
    System.out.println(numberOfOccurrences);
    ```



* Sample Output

    ```
    2
    ```
    

### Example 3
* Sample Script

    ```
    // : Given
    String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
    
    // : When
    int numberOfOccurrences = StringArrayUtils.getNumberOfOccurrences(array, "baa");
    
    // : Then
    System.out.println(numberOfOccurrences);
    ```



* Sample Output

    ```
    1
    ```

















<br><br><br><br>
## Sample Behavior<br> `StringArrayUtils.contains(array, value)`

### Example 1
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    boolean outcome = StringArrayUtils.contains(array, "the");
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    true
    ```
    
    
    

### Example 2
* Sample Script

    ```
    // : Given
    String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
    
    // : When
    boolean outcome = StringArrayUtils.contains(array, "potatoes");
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    false
    ```
