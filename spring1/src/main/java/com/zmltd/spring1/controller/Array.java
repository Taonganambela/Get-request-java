package com.zmltd.spring1.controller;

public class Array {

    // static int[] myArray = {1, -3, 6, 7, 50, 99};
    

    public static void main(String[] args){
    //    System.out.println( myArray.length);
       int[] Arr = new int[50];

    //    System.out.println(Arr.length);

    // for(int i = 0 ; i < myArray.length; i++){
    //     System.out.println(myArray[i]);
    // }
    // = Arr.length-1  ;
   

    for(int i=0; i < Arr.length ; i = i + 1 ){
        Arr[i] = i + 1;
    }
  
    // for(int i=0 ; i < Arr.length ; i = i + 1 ){
    //     System.out.println(Arr[i]);
    // }
        System.out.println("----------------------------------");
        System.out.println(Arr.length-1);

        for(int k = Arr.length-1; k >= 0 ; k-- ){
                System.out.println(Arr[k]);
            }


    }
}
