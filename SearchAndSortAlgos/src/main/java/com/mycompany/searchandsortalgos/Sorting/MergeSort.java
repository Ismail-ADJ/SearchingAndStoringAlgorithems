/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchandsortalgos.Sorting;

/**
 *
 * @author ADMIN
 */
public class MergeSort {
    int[] array ;
    int[] tempArray;

public MergeSort(int[] array) {
        this.array = array;
        this.tempArray = new int [array.length];
    }
public void PreperForSorting( int min , int max){
if(min<max){
    int mid=min+(max-min)/2;
    System.out.println("mid: "+mid+"min: "+min);
PreperForSorting(min,mid);  
    System.out.println("Secnd side: ");
PreperForSorting(mid+1,max); 
MergeingPart(min,mid,max);
}  
}
public void MergeingPart (int min,int mid, int max) {
for(int i=min; i<=max;i++)
    tempArray[i]=array[i];
int i=min;
int j=mid+1;
int k=min;
while(i<=mid&&j<=max){
if(tempArray[i]<=tempArray[j]){
array[k]=tempArray[i];
i++;
}else {
array[k]=tempArray[j];
j++;
}
k++;
}
while(i<=mid){
array[k]=tempArray[i];
k++;
i++;
}
//DisplayArray(array);
}  
public void DisplayArray(){
  for(int i=0 ; i<array.length;i++)
     System.out.println(array[i]);
} 
}
