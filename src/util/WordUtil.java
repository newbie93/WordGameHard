package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WordUtil {
	
	public static String takeInputWord() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
	// implement when dic is ready
	public static boolean isValidWord(String word) {
		return true;
	}

	public static String createHash(String word) {
		String hash = "";
		for (char ch='a';ch<='z';ch++) {
			if(word.contains(""+ch)) 
				hash+="1";
			else
				hash+="0";
		}
		return hash;
	}
	
	public static int matchingChars(String word1, String word2) {
		boolean arr1[]=new boolean[26];
		boolean arr2[]=new boolean[26];
		int matches=0;
		for(int i=0;i<26;i++)
			arr1[i]=arr2[i]=false;
		for(char c:word1.toCharArray())
			arr1[c-'a']=true;
		for(char c:word2.toCharArray())
			arr2[c-'a']=true;
		for(int i=0;i<26;i++) {
			if(arr1[i]&&arr2[i])
				matches++;
		}
		return matches;
	}


}
