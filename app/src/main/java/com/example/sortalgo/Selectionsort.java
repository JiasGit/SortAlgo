package com.example.sortalgo;

import android.util.Log;

public class Selectionsort {
    int[] array;

    public Selectionsort(int[] array) {
        this.array = array;
    }
    public void print(){
        for(int i=0; i< array.length; i++)
            Log.d("MyArraysort", ""+array[i]);
    }

    public void sort(){
        for(int i=0; i<array.length; i++){
            int currentMin = i;
            for(int j = i+1; j< array.length; j++){
                if(array[j] < array[currentMin])
                    currentMin = j;
            }
            if(array[i] > array[currentMin]){
                int temp = array[currentMin];
                array[currentMin] = array[i];
                array[i] = temp;
            }
        }
    }
}
