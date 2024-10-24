package Arrays;

public class MergingOf2Arrays {
	static int[] resultantArr;

	public static void main(String[] args) {
		int[] firstArr=new int[] {6,7,3,1,2};

		int[] secondArr=new int[] {1,10,-20,-3};
		System.out.println("the first array is: ");
		printArr(firstArr);
		System.out.println("the second array is: ");
		printArr(secondArr);
		System.out.println("the clonned array is: ");
		clone2Arrays(firstArr, secondArr);
		printArr(resultantArr);

	}
    public static void printArr(int[] a) {
    	for(int el:a) {
    		System.out.print(el + " ");
    	}
    	System.out.println();
    }
	
	//resource of cloning of two array
	public static void clone2Arrays(int[] ar1,int[] ar2) {
		//creation of resultantArr
		resultantArr=new int[ar1.length+ar2.length];
		//cloning of first array
		for(int i=0;i<ar1.length;i++) {
			resultantArr[i]=ar1[i];
		}
		//cloning of second array
		for(int i=0;i<ar2.length;i++) {
			resultantArr[ ar1.length+i]=ar2[i];
		}
	}
	

}
