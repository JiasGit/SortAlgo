package com.example.sortalgo;

import android.util.Log;

public class Mergesort {

    int[] array;

    public Mergesort(int[] array) {
        this.array = array;
    }

    public void print(){
        for(int i=0; i< array.length; i++)
            Log.d("MyArraysort", ""+array[i]);
    }

    public void sort(int[] array){

        int leftSize = array.length/2;
        int[] left = new int[leftSize];
        int[] right = new int[array.length - leftSize];

        if(array.length < 2)
            return;

        for(int i=0; i< leftSize; i++){
            left[i] = array[i];
        }
        for (int j=0; j< array.length-leftSize ; j++){
            right[j] = array[leftSize + j];
        }

        sort(left);
        sort(right);
        merge(array, left, right);
    }

    private void merge(int[] array, int[] left, int[] right){
        int leftSize = left.length;
        int rightSize = right.length;
        int i=0, j=0, k=0;

        while(i<leftSize && j<rightSize){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            }else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            array[k] = left[i];
            i++;
            k++;
        }
        while(j < rightSize){
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
