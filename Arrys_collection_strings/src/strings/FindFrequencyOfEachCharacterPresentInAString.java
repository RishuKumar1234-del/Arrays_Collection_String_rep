package strings;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfEachCharacterPresentInAString {

	public static void main(String[] args) {
		String s="your bottle is as same as my bottle";
		findFrequencyOfEachCharacter(s);
		System.out.println();
		findMaxChar(s);

	}
	
	//resource to determine frequency of each character present in a string
	public static void findFrequencyOfEachCharacter(String str) {
		//String[] sar=str.split("\\s");
		char[] ch=str.replaceAll("\\s", "").toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(Character c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
			
		}
		for(Map.Entry<Character, Integer> me: hm.entrySet()) {
			System.out.println(me.getKey() + " : " +me.getValue());
		}
	}
	//resource for maximum repeating characters
	public static void findMaxChar(String str) {
		char[] ch=str.replaceAll("\\s", "").toCharArray();
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		int maxCount=0;
		char maxChar=' ';
		for(Map.Entry<Character, Integer> me: map.entrySet()) {
			if(maxCount<me.getValue()) {
				maxCount=me.getValue();
				maxChar=me.getKey();
			}
		}
		System.out.println("maximum repeated character is: " +maxChar + " " +maxCount +" times");
	}

}
