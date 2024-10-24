package strings;

import java.util.Scanner;

public class Pallindrome_CapitalizeEachWord_ {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your word");
		String input=scan.nextLine();
		System.out.println("the original String is: " +input);
		System.out.println("\nthe reversed string is: " +reverseTheStringWithoutUsingInbuiltMethod(input));
		System.out.println("check whether this string is pallindrome or not : ");
		isPallindrome(input);
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("\nfollowing is the new capitalized word");
        capitalzieEachWordddd(input);
	}
	
	
	//resource for reversing the stream
	public static String reverseTheStringWithoutUsingInbuiltMethod(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}
	
	//resource for Pallindrome
	public static void isPallindrome(String str) {
	//	String reversed=new StringBuilder(str).reverse().toString();
		String reversed=reverseTheStringWithoutUsingInbuiltMethod(str);
		if(reversed.equalsIgnoreCase(str)) {
			System.out.println("yes,This is Pallindrome");
		}
		else {
			System.err.println("No,This is not Pallindrome");
		}
	}
	
	//resource for capitalize Each word
	public static void capitalzieEachWordddd(String str) {
		String[] allWords=str.split("\\s");
		String capitalizedWord="";
		for(String w:allWords) {
			String firstSubstring=w.substring(0, 1);
			String substringAfterFirst=w.substring(1);
			capitalizedWord+=capitalizedWord+firstSubstring.toUpperCase()+substringAfterFirst;
			System.out.print(capitalizedWord + " ");
			
		}
		System.out.println();
	}

}
