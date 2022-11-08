/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchingandstoringalgo.SearchingAlgo;

/**
 *
 * @author ADMIN
 */
public class LinearSearch {
    int value;
    int[] array;

    public LinearSearch( int[] array, int value) {
     
        this.array = array;
          this.value = value;   
int nb=0;
 for(int i=0;i<array.length;i++){
     nb++;
     if (array[i]==value){
         
System.out.println("nomber is found after :" + nb + " tries");
     break;
             
     }
 }
    }
    

}
