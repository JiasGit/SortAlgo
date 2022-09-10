package com.example.sortalgo;

import android.util.Log;

public class Simplesort {
    int[] array;

    public Simplesort(int[] array) {
        this.array = array;
    }

    public void print(){
        for(int i=0; i< array.length; i++)
            Log.d("MyArraysort", ""+array[i]);
    }

    public void sort(){
        for(int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++)
                if(array[j]<array[i]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;}

        }
    }
}
