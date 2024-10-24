package Arrays;

public class ClosestElementOfAnArray {

	public static void main(String[] args) {
		int[] arr=new int[] {28,13,15,7,9,34,19,36};
		int target=6;
		System.out.println("the closest element to " + target + " is : " +findClosestElementOfAnarray(arr, target));

	}
	public static int findClosestElementOfAnarray(int[] ar,int target) {
		
		int left=0;
		int right=ar.length-1;
		while(left<=right) {
			if(Math.abs(ar[left]-target)<=Math.abs(ar[right]-target)) {
				right--;
				
			}
			else {
				left++;
			}
		}
		
		return ar[left];
		
	}

}
