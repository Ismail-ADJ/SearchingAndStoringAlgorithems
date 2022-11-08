/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandstoringalgo.SearchingAlgo;

/**
 *
 * @author ADMIN
 */
public class BinarySearch {
    int[] array;
    int value;
    int low;
    int high;
    int mid;
    int nb;
    public BinarySearch(int[] array, int value) {
        this.array = array;
        this.value = value;
         low=0;
         high=array.length-1; 
    }
  
    void SearchValue(){
      while(true) {  
//       for Binarry Search we use this formoula  
         mid=low+((high-low)/2);

//       for InterPolation Search we use this formoula  
//      it's stander formula we can use it with numbers phones libraries

//         mid=low+((high-low)/(array[high]-array[low]))*(value-array[low]);         
         
         System.out.println("mid is :" +mid);
          nb++;
     if(low>high){ 
           System.out.println("nomber is not found "+ " nb : "+nb+" low = "+low +" high = "+ high );
          break;}
       if(array[mid]==value){ 
           System.out.println("nomber is found after :" + nb + " tries");
          break;}
       if(array[mid]<value){
        low=mid+1;
//       System.out.println("low is :" +low);
       }
       if(array[mid]>value){
        high=mid-1;   
//        System.out.println("high is :" +high);
            }
        
        } 
    }

  
    
    
    
    
    
    void SearchWithREcurtion(int[] arr, int low,int high){
    mid=low+((high-low)/2);
    nb++;
    if(array[mid]==value){ 
           System.out.println("nomber is found after :" + nb + " tries");} 
      
    else if(array[mid]<value){
    low=mid+1;
    SearchWithREcurtion(arr,low,high);
    }
    else if(array[mid]<value){
    high=mid-1;   
    SearchWithREcurtion(arr,low,high);
    }
    
    }
    
}
