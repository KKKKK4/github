package com.maven;

public class dubble {
   public static void main(String[] args){
       int [] arr = {3,5,6,7,90,112,33,0,67,88,34,77,90,23};
       for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-1-i;j++){
               if(arr[j]>arr[j+1]){
                   int t = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = t;
               }
           }
       }
       for(int i:arr){
           System.out.println(i);

       }
   }

}
