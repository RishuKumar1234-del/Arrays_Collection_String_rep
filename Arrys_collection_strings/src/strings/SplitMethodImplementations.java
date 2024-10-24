package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SplitMethodImplementations {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your sentence");
		String input=scan.nextLine() ;
		System.out.println("the total words present in the given sentence is: " +wordCountOfString(input));
		System.out.println("\nAnd the frequency of the words of the given sentence is: ");
		calculateFrequencyOfString(input);
		System.out.println();
		fetchTotalWordsAccordingToUser(input);
	}
	
	//first resource for counting the total number of words in a given string
	public static int wordCountOfString(String str) {
		String[] inputWords=str.split("\\s");
		int totalword=inputWords.length;
		
		return totalword;
	}
	
	//second resource for calculating the frequency of words/characters in a given string
	public static void calculateFrequencyOfString(String str) {
		String[] allWordsOfString=str.split("\\s");
	  HashMap<String, Integer> hm= new HashMap<String, Integer>();
	  for(String eachWord:allWordsOfString) {
		  if(hm.containsKey(eachWord)) {
			  hm.put(eachWord, hm.get(eachWord)+1);
		  }
		  else {
			  hm.put(eachWord, 1);
		  }
	  }
	  System.out.println("\nfrequency of the given string is given below");
	  for(Map.Entry<String,Integer> me:hm.entrySet()) {
		  System.out.println(me.getKey() + " => " +me.getValue());
	  }
	}
	
	//fetch the number of words as much user wants
	public static int fetchTotalWordsAccordingToUser(String s) {
		String[] str=s.splitWithDelimiters(",", 2);
	    int totalWordsReturned=str.length;
	    System.out.println(totalWordsReturned);
	    for(String words:str) {
	    	System.out.println(words + " ");
	    }
	    System.out.println();
	    return totalWordsReturned;
	}

}
