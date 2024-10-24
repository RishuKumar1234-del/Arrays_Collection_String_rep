package Arrays;

public class CloningOfanArrayintoOtherArray {
	 static int[] tempArr;
	static int length;

	public static void main(String[] args) {
		int[] inputArr=new int[] {20,15,11,30,23,17};
		System.out.println("the anonymous array is: ");
		printArray(inputArr);
		System.out.println("the clonned array is: ");
		cloneThisArrayIntoAnotherArray(inputArr);
		printArray(tempArr);
          
	}
	
	//resource for cloning of an array into another array
	public static void cloneThisArrayIntoAnotherArray(int[] arr) {
	  length=arr.length;
	  //creation of temporary array
	  tempArr=new int[length];
	  //cloning of input array into temporary array
	  for(int i=0;i<arr.length;i++) {
		  tempArr[i]=arr[i];
	  }
	}
	
	//resource for printing the array
	public static void printArray(int[] arr) {
		for(int el:arr) {
			System.out.print(el + " ");
		}
		System.out.println();
	}

}
