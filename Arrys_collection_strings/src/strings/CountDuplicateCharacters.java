package strings;

public class CountDuplicateCharacters {

	public static void main(String[] args) {
		String s1="applicationy";
		String s2="claSsifier";
		countRepeatingCharacters(s2);
	}
	
	//resource for counting duplicate characters by using for loop: approach
	public static void countRepeatingCharacters(String str) {
		int count=0;
		char[] c=str.toLowerCase().toCharArray();
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(c[i]==c[j]) {
					System.out.print(c[i] + ",");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("the total number of dup char present in string is: " +count);
	}


}
