/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.searchandsortalgos;

import com.mycompany.searchandsortalgos.Sorting.BubbleSort;
import com.mycompany.searchandsortalgos.Sorting.MergeSort;
import com.mycompany.searchandsortalgos.Sorting.QuickSort;
import com.mycompany.searchandsortalgos.Sorting.heapSort;



/**
 *
 * @author ADMIN
 */
public class SearchAndSortAlgos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
          int[] arr= new int[6];
//        arr[0]=12;
//        arr[1]=2;
//        arr[2]=24;
//        arr[3]=4;
//        arr[4]=11;
//        arr[5]=13;
//        arr[6]=15;
//        arr[7]=44;
        
        arr[0]=1;
        arr[1]=50;
        arr[2]=30;
        arr[3]=10;
        arr[4]=60;
        arr[5]=80;
        
////********************** For Bubble Sort
// BubbleSort BbSort=new BubbleSort();
// BbSort.DisplayArray(arr);
// arr = BbSort.SortingBubbl(arr);
// System.out.println("After Sorting: ");
// BbSort.DisplayArray(arr);

////  ********************** For Merge Sort
//MergeSort mrgSort= new MergeSort(arr);
//mrgSort.PreperForSorting(0, arr.length-1);
//mrgSort.DisplayArray();

//***********************For Heap Sort
heapSort heaps=new heapSort(arr);
heaps.PreSort(arr);
heaps.DisplayArray();

////***********************For Quick Sort
//QuickSort qsort= new QuickSort();
//qsort.QuickSRT(arr,0,arr.length-1);
//qsort.DisplayArray();
        
        
    }
}
