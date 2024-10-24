package Arrays;

import java.util.Scanner;

public class Delcaration_Creation_Retrieval {

	public static void main(String[] args) {
		//anonymous array
	    int[] arr=new int[] {2,3,4};
	    //declaration and creation together
	    int[] myArr=new int[5];
	    printArrayBySimpleForLoop(arr);
	    System.out.println("\n");
	    printArrayByUsingForeachForLoop(arr);
	    System.out.println("enter the elements of your array");
	    inputFromUser(myArr);
	    System.out.println("My array is: ");
	    printArrayByUsingForeachForLoop(myArr);
	

	}
	//resource for printing the default value of an array
	public static void printDefaultValueOfAnArray(int[] ar) {
		int[] a=new int[ar.length];
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] +" ");
		}
	}
	//resource for retrieval of an array by using simple for loop
	public static void printArrayBySimpleForLoop(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
	
	//resource for retrieval of an array by using for-each for loop
	public static void printArrayByUsingForeachForLoop(int[] ar) {
		for(int element:ar) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	//resource for initialization of an array from user dynamically
	public static void inputFromUser(int[] a) {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
	}
	

}
