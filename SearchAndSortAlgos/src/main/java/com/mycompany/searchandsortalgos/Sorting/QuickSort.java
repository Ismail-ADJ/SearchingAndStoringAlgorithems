/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchandsortalgos.Sorting;

/**
 *
 * @author ADMIN
 */
public class QuickSort {
int [] array;
    public void QuickSRT(int[] array, int low , int high){
 this.array=array;       
 if(low > high) return;
 int middle=low+(high-low)/2;
 int pivot=array[middle];
 int i=low;
 int j = high;
 while(i<=j){
     while(array[i]<pivot){
        i++;
 }
    while(array[j]>pivot){
    j--;
    }
    if(i<=j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        i++;
        j--;  }  
 }
if(low<j) QuickSRT(array,low, j);
if(high>i) QuickSRT(array,i, high);    
    }
 public void DisplayArray(){
  for(int i=0 ; i<array.length;i++)
     System.out.println(array[i]);
}    
}
