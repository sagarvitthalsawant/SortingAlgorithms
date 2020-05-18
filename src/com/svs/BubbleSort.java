package com.svs;

public class BubbleSort {

    // smallest to largest

    public void bubbleSort(){

        // i starts at the end of the Array
        // As it is decremented all indexes greater
        // then it are sorted

        for(int i = UtilityClass.arraySize - 1; i > 1; i--){

            // The inner loop starts at the beginning of
            // the array and compares each value next to each
            // other. If the value is greater then they are
            // swapped

            for(int j = 0; j < i; j++){

                // To change sort to Descending change to <

                if(UtilityClass.theArray[j] > UtilityClass.theArray[j + 1]){

                    UtilityClass.swapValues(j, j+1);

                    UtilityClass.printHorzArray(i, j);

                }

            }

        }

    }

}
