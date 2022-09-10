package com.example.sortalgo;

import android.util.Log;

public class Insertionsort {
    int[] array;

    public Insertionsort(int[] array) {
        this.array = array;
    }

    public void print(){
        for(int i=0; i< array.length; i++)
            Log.d("MyArraysort", ""+array[i]);
    }

    public void sort(){
        for(int i=1; i<array.length; i++){
            int j = i-1;
            int current = array[i];
            while(j>=0 && array[j] > current){
                array[j+1]=array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
}
