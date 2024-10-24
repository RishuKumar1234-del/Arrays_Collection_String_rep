package Arrays;

public class BinarySearchForSortedArray {

	public static void main(String[] args) {
		int[] inputArr=new int[] {5,3,1,9,12,7};
		System.out.println("the original array is: ");
		printArr(inputArr);
		binarySearchOfAnElement(inputArr, 9);
		

	}
	public static void printArr(int[] a) {
		for(int el:a) {
			System.out.print(el + " ");

		}
		System.out.println();
	}
	
	//resource for binary search
	public static void binarySearchOfAnElement(int[] ar,int searchItem) {
		int li=0;
		int hi=ar.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(ar[mi]==searchItem) {
				System.out.println("the element is present at " +mi + " postion number");
				break;
			}
			else if(ar[mi]>searchItem) {
				hi--;
			}
			else {
				li++;
			}
			mi=(li+hi)/2;
			
		}
		if(li>hi) {
			System.err.println("element is not found");
		}
		
		
	}
	
	

}
