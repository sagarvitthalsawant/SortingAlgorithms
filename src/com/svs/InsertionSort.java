package com.svs;

public class InsertionSort {

    // The Insertion Sort is normally the best of
    // the elementary sorts. Unlike the other sorts that
    // had a group sorted at any given time, groups are
    // only partially sorted here.

    public void insertionSort(){

        for (int i = 1; i < UtilityClass.arraySize; i++){
            int j = i;
            int toInsert = UtilityClass.theArray[i];
            while ((j > 0) && (UtilityClass.theArray[j-1] > toInsert)){
                UtilityClass.theArray[j] = UtilityClass.theArray[j-1];
                j--;

                UtilityClass.printHorzArray(i, j);

            }
            UtilityClass.theArray[j] = toInsert;

            UtilityClass.printHorzArray(i, j);

            System.out.println("\nArray[i] = " + UtilityClass.theArray[i] + " Array[j] = " + UtilityClass.theArray[j] + " toInsert = " + toInsert + "\n");

        }

    }
}
