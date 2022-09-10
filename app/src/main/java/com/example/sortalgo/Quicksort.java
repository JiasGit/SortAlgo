package com.example.sortalgo;

import android.util.Log;

import java.util.Random;

public class Quicksort {

    int[] array;

    public Quicksort(int[] array) {
        this.array = array;
    }

    public void print(){
        for(int i=0; i< array.length; i++)
            Log.d("MyArraysort", ""+array[i]);
    }

    public void sort(int[] array, int lowIndex, int highIndex){

        if(lowIndex>=highIndex)
            return;

        /*int pivotIndex = new Random().nextInt(highIndex-lowIndex)+ lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);*/

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;

            while(array[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        sort(array, lowIndex, leftPointer -1);
        sort(array, leftPointer +1, highIndex);
    }

    private void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left]= array[right];
        array[right] = temp;
    }
}
