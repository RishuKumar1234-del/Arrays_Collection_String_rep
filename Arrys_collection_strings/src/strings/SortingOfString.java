package strings;

import java.util.Arrays;

public class SortingOfString {

	public static void main(String[] args) {
		String input="rishu";
		sortingTheString(input);
		

	}
	//resource for sorting any string
	public static void sortingTheString(String str) {
		System.out.println("the original string is: " +str);
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		String sortedStr="";
		sortedStr=new String(ch);
		System.out.println("the sorted string is: " +sortedStr);
	}

}
