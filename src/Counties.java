import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Counties {

    /**
     * Create a method
     * method name should be smallestNumber  <-------   METHOD NAME SHOULD BE AS THIS
     * method should take a tree number(int) and return smallest number(int)
     * Write a Java method to find the smallest number among three numbers.
     */


    public int smallestNumber(int a, int b, int c) {

        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }


    /**
     * Create a method
     * method name is middleCharacter    <-------   METHOD NAME SHOULD BE AS THIS
     * this method should take a String as parameter and return char
     * Write a Java method to display the middle character of a string
     * if the string length is even number return 0
     */
    public char middleCharater(String str) {
        char[] arr = str.toCharArray();
        int length = str.length();
        int len = length / 2;
        char c = arr[len];
        if (length % 2 == 0) {
            return '0';
        } else {
            return c;
        }
    }


    /**
     * Create a method
     * method name is dayOfTheWeek    <-------   METHOD NAME SHOULD BE AS THIS
     * this method return type is string parameter is number(int)
     * if the number is 1 return monday
     * if the number is 2 return tuesday
     * if the number bigger then 7 then return -->> this is not a expected input
     */
    public static String dayoftheWeek(int number) {

        String result = "";
        if (number == 1) {
            result = "Monday";
        } else if (number == 2) {
            result = "Tuesday";
        } else if (number == 3) {
            result = "Wednesday";
        } else if (number == 4) {
            result = "Thursday";
        } else if (number == 5) {
            result = "Friday";
        } else if (number == 6) {
            result = "Saturday";
        } else if (number == 7) {
            result = "Sunday";
        } else {
            result = "this is not a expected input";
        }
        return result;
    }


    /**
//     *
     * if CountThis String in the myCounties ArrayList then return how many of CountThis string in the myCounties
     * if CountThis is not in the myCountries then return -1
//     */
    public int countCountry(ArrayList<String> myCountries, String CountThis) {

        if (!myCountries.contains(CountThis)) {
            return -1;
        }
        int result = 0;
        // START THE CODE FROM HERE
        for (String myCountry : myCountries) {

            if (myCountry.equals(CountThis)) {

                result++;
            }


        }
        // CODE END HERE
        return result;
    }

    /**
     * sort the arrayList
     * for example list is equal to =====>>   england USA brazil
     * result should be ====>>>   brazil england USA
     */
    public ArrayList<String> sortArrayList(ArrayList<String> myCountries) {
        myCountries.add("England");
        myCountries.add("USA");
        myCountries.add("brazil");
        Collections.sort(myCountries);

        return myCountries;
    }

    /**
     * Reverse the ArrayList
     * for example if the list is equal to ======>>>>   england USA brazil
     * result should be =====>>>> brazil USA england
     */
    public ArrayList<String> reverseTheList(ArrayList<String> myCountries) {
        ArrayList<String> reverse = new ArrayList<>();
//       start writing the code here

        for (int i = myCountries.size() - 1; i >= 0; i--) {
            reverse.add(myCountries.get(i));
        }
//        ends here
        return reverse;
    }

    /**
     * if first array contains second array then result is true if not then false
     * Example1:
     * first array =====>>> China Russia USA Mexico
     * Second array =====>>>>Mexico Russia USA China
     * result true
     * Example2:
     * first array =====>>> China USA Mexico
     * Second array =====>>>>Mexico Russia USA China
     * return false
     */
    public boolean isFirstArrayListContainsSecondArrayList(ArrayList<String> firstArray, ArrayList<String> SecondAray) {

        boolean isFirstArrayListContainsSecondArrayList = false;
        for (String s : firstArray) {
            for (String s1 : SecondAray) {
                if (s == s1) {
                    isFirstArrayListContainsSecondArrayList = true;
                } else
                    isFirstArrayListContainsSecondArrayList = false;
            }
        }
        return isFirstArrayListContainsSecondArrayList;
    }


    /**
     * if ArrayList myCountries have a firstCountry then replace it with a secondCountry
     * for Example myCountries list ===========>>>> Brazil USA Mexico USA
     * firstCountry =======>>>> USA
     * SecondCounty========>>> Canada
     * result should be Brazil Canada Mexico Canada
     */
    public ArrayList<String> replaceTheCountry(ArrayList<String> myCountries, String firstCountry, String SecondCounry) {

        for (String s : myCountries) {

            if (myCountries.contains(firstCountry)) {
                myCountries.add(SecondCounry);

            } else {
                myCountries.add("-1");
            }
        }
        return myCountries;
    }
}
