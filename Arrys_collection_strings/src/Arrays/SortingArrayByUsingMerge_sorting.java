package Arrays;

public class SortingArrayByUsingMerge_sorting {
           int length;
           int[] array;
           int[] tempMergeArr;
	public static void main(String[] args) {
		SortingArrayByUsingMerge_sorting sms=new SortingArrayByUsingMerge_sorting();
		int[] inputArr= {8,9,10,5,1,7,16};
		System.out.println("the original array is: ");
		printArr(inputArr);
		System.out.println("the sorted array is: ");
		sms.sort(inputArr);
		printArr(inputArr);
	}
	
	public static void printArr(int[] a) {
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}
	
	public void sort(int[] arr) {
		this.length=arr.length;
		this.array=arr;
		this.tempMergeArr=new int[length];
		
		divideArr(0, length-1);
	}
	
	public void divideArr(int li,int hi) {
		if(li<hi) {
			int mi=(li+hi)/2;
			
			divideArr(li, mi);
			divideArr(mi+1, hi);
			
			mergeArray(li, mi, hi);
		}
	}
	public void mergeArray(int li,int mi,int hi) {
		for(int i=li;i<=hi;i++) {
			tempMergeArr[i]=array[i];
		}
		
		int i=li;
		int j=mi+1;
		int k=li;
		while(i<=mi && j<=hi) {
			if(tempMergeArr[i]<tempMergeArr[j]) {
				array[k]=tempMergeArr[i];
				i++;
			}
			else {
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=mi) {
			array[k]=tempMergeArr[i];
			i++;
			k++;
		}
		
	}

}
