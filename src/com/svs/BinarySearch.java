package com.svs;

public class BinarySearch {

    // The Binary Search is quicker than the linear search
    // because all the values are sorted. Because everything
    // is sorted once you get to a number larger than what
    // you are looking for you can stop the search. Also
    // you be able to start searching from the middle
    // which speeds the search. It also works best when
    // there are no duplicates

    public void binarySearchForValue(int value){

        int lowIndex = 0;
        int highIndex = UtilityClass.arraySize - 1;

        while(lowIndex <= highIndex){

            int middleIndex = (highIndex + lowIndex) / 2;

            if(UtilityClass.theArray[middleIndex] < value) lowIndex = middleIndex + 1;

            else if(UtilityClass.theArray[middleIndex] > value) highIndex = middleIndex - 1;

            else {

                System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);

                lowIndex = highIndex + 1;

            }

            UtilityClass.printHorzArray(middleIndex, -1);

        }

    }

}
