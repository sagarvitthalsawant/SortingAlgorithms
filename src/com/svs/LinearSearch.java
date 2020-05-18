package com.svs;

public class LinearSearch {

    public String linearSearchForValue(int value){

        boolean valueInArray = false;

        String indexsWithValue = "";

        for(int i = 0; i < UtilityClass.arraySize; i++){

            if(UtilityClass.theArray[i] == value){

                valueInArray = true;

                indexsWithValue+= i + " ";

            }

            UtilityClass.printHorzArray(i, -1);

        }

        if(!valueInArray){

            indexsWithValue = "None";

        }

        System.out.print("The Value was Found in the Following: " + indexsWithValue);

        System.out.println();

        return indexsWithValue;

    }



}
