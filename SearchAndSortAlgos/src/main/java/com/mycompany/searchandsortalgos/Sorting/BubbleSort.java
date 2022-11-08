package com.mycompany.searchandsortalgos.Sorting;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.time.Clock;

/**
 *
 * @author ADMIN
 */
public class BubbleSort {

 int temp; 
 int size;
 int [] array;
public int [] SortingBubbl(int [] array){
    this.array=array;
    size=array.length;
 for(int i=0 ; i<size;i++){
     for(int j=1; j<(size-i);j++){
     if(array[j-1]>array[j]){
         Sowpe((j-1),j);}
     } }
 return array;
 
}    
void Sowpe(int  v1, int v2){
 System.out.println("Sowp happen"+v1+"  "+v2);
temp=array[v1];
array[v1]=array[v2];
array[v2]=temp;

}    
 public void DisplayArray(int [] array){
  for(int i=0 ; i<array.length;i++)
     System.out.println(array[i]);
}    
}
