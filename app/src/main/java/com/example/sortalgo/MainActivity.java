package com.example.sortalgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] arr = new Random().ints(10, 0, 100).toArray();

//        Simplesort
        /*Simplesort simplesort = new Simplesort(arr);
        simplesort.print();
        simplesort.sort();
        simplesort.print();*/

//        Insertionsort
        /*Insertionsort insertionsort = new Insertionsort(arr);
        insertionsort.print();
        insertionsort.sort();
        Log.d("MyArraysort", "After sorting");
        insertionsort.print();*/

//        Bubblesort
        /*Bubblesort bubblesort = new Bubblesort(arr);
        bubblesort.print();
        bubblesort.sort();
        Log.d("MyArraysort", "After sorting");
        bubblesort.print();*/

//        Selectionsort
        /*Selectionsort selectionsort = new Selectionsort(arr);
        selectionsort.print();
        selectionsort.sort();
        Log.d("MyArraysort", "After sorting");
        selectionsort.print();*/

//        Mergesort
        /*Mergesort mergesort = new Mergesort(arr);
        mergesort.print();
        mergesort.sort(arr);
        Log.d("MyArraysort", "After sorting");
        mergesort.print();*/

//        Quicksort
        /*Quicksort quicksort = new Quicksort(arr);
        quicksort.print();
        Log.d("MyArraysort", "After sorting");
        quicksort.sort(arr, 0, arr.length-1);
        quicksort.print();
*/


        String[] names = {"amy", "sean", "tracy"};
        String[] fullnames = {"spender", names, "lucy"};
        String[] res = ArrayUtils.addAll(names, fullnames);
        Log.d("printnames", ""+res);

    }
}