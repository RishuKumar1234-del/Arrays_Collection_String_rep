package strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringAsAnagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the two words");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		isAnagram(s1, s2);
		
	}
	
	public static void isAnagram(String s1,String s2) {
		if(s1.length()==s2.length()) {
			char[] c1=s1.toLowerCase().replaceAll("\\s", "").toCharArray();
			char[] c2=s2.toLowerCase().replaceAll("\\s", "").toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			for(int i=0;i<c1.length;i++) {
				if(c1[i]==c2[i]) {
					
				}
			}
			System.out.println("yes, this is anagram");
		}
		else {
			System.err.println("the given string is not Anagram");
		}
	}

}
