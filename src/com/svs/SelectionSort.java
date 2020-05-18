package com.svs;

public class SelectionSort {

    // Selection sort search for the smallest number in the array
    // saves it in the minimum spot and then repeats searching
    // through the entire array each time

    public void selectionSort(){

        for(int x=0; x < UtilityClass.arraySize; x++){
            int minimum = x;

            for(int y=x; y < UtilityClass.arraySize; y++){

                // To change direction of sort just change
                // this from > to <

                if(UtilityClass.theArray[minimum]>UtilityClass.theArray[y]){
                    minimum = y;
                }
            }

            UtilityClass.swapValues(x, minimum);

            UtilityClass.printHorzArray(x, -1);
        }

    }

}
