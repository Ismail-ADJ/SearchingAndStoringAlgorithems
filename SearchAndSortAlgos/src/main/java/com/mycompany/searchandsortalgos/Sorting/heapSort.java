/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchandsortalgos.Sorting;

/**
 *
 * @author ADMIN
 */
public class heapSort {
 static int total;
 int[]array;

    public heapSort(int[] array) {
        this.array = array;
        DisplayArray();
       total=array.length-1; 
    }
 
 
 void Swap(int[] arr, int a , int b){
        
       int temp=arr[a];
       arr[a]=arr[b];
       arr[b]=temp;
}    
 
 public  void PreSort(int[] arr){
//     this.array = arr;
     total=array.length-1;
     for(int i=total/2 ; i>0; i--)
        Heapify(arr,i) ;
     for(int i=total;i>=0;i--){
           Swap(arr,0,i);
           total--;
           Heapify(arr,0) ; 
     }} 
 
 void Heapify( int [] arr, int RootIndex){ 
     
    int LeftNodeIndex=RootIndex*2 ;
    int rightNodeindex=RootIndex*2+1;
    int MaxIndex=RootIndex;  
    if(LeftNodeIndex < total && arr[LeftNodeIndex] > arr[RootIndex]  )
     MaxIndex=LeftNodeIndex;
    if(rightNodeindex < total && arr[rightNodeindex] < arr[RootIndex]  )
        MaxIndex=rightNodeindex; 
    
    if(MaxIndex!=RootIndex)
          {
              Swap(arr,RootIndex,MaxIndex);
              Heapify(arr,MaxIndex);
             }}   
public void DisplayArray(){
  for(int i=0 ; i<array.length;i++)
     System.out.println(array[i]);
} 
}
