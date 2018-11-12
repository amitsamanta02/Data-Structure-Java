/*
 * Writer: Amit Samanta , Email: amitsamanta002@gmail.com
 */

package org.amit.ds.Sorting;

public class BubbleSort {
	
	public static void main(String args[]){
		int [] arr = {90,70,30,10,80,20,50,40,60};

		//Algorithm for bubble sort here with 2 for loop statement.
	
	System.out.println("Length of the array:"+arr.length);
		for(int i =0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sort items are:\t");
	 for(int item:arr){
		 System.out.println(item);
	 }
	}
}
