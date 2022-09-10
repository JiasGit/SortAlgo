package com.example.sortalgo;

import android.util.Log;

public class Bubblesort {
    int[] array;

    public Bubblesort(int[] array) {
        this.array = array;
    }

    public void print(){
        for(int i=0; i< array.length; i++)
            Log.d("MyArraysort", ""+array[i]);
    }

    public void sort(){
        for(int i =0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
    }
}
