package com.graymatter;

import java.util.Scanner;

public class DemoOnArray {
	
	
	public static boolean isPrime(int num) {
		boolean flag=true;
		//write code here
		return flag;
	}
	
	public static void lsearch(int arr[],int key) {
		int i;
		for( i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("element found");
				break;
			}
		}
		
		if(i==arr.length-1)
			System.out.println("not found");
		
	}
	
	//use sorted array
	public static void binSearch(int arr[],int key) {
	
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("element found");
				break;
			}
			else if(key<arr[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		
		if(low>high)
			System.out.println("not found");
		
		
	}

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		arr[0]=45;arr[3]=25;
		int arr1[]= {1,2,3,4,5,6};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		//print only even numbers
		//find the sum of elements of array
		//print prime numbers of the array
		//linear search
		//binary search
		//bubble sort
		
		//find the count of a given element in the array 1,2,7,4,5,3,2,8,2,,9 ,check for 2 repetions
		//insert an element at the length position
		//insert an element at a given position
		//delete an element at a given position
		
		
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.println("prime");
			}
			else
				System.out.println("not");
		}
		
		
		lsearch(arr,55);
		binSearch(arr,60);
		
		//enhanced for loop
		for(int i:arr)
			System.out.println(i);
		
		
		int jag[][]=new int[3][];//jagged array
		 jag[0]=new int[5];
		 jag[1]=new int[2];
		 jag[2]=new int[3];
		
		
	}
	

	//Matrix addition,subtraction,multiplication,transpose,
	//upper triangular,lower triangular,diagonal matrices
	
	
	
}
