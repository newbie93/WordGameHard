package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import fileops.ReadDic;
import game.GameDifficulty;

public class WordUtil {
	
	private final ArrayList<String>allWords;
	private ArrayList<String>wordList;
	
	public WordUtil(int length) {
		ReadDic readDic=new ReadDic(length);
		allWords=readDic.getAllWords();
		wordList=readDic.getWordList();
		//for(String str:allWords)
		//	System.out.println(str);
	}
	
	public void updateWordList(int matchingCharacters, String chosenWord){
		ArrayList<String> newWords =  new ArrayList<>();
		for(int i=0;i<wordList.size();i++)
			if(matchingCharacters == matchingChars(wordList.get(i),chosenWord)){
				newWords.add(wordList.get(i));
			}
		wordList = newWords;
	}
	
	public static String takeInputWord() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}
	
    public static boolean containsOnlyUnique(String word) {
          String arr[] = word.split("");
          Arrays.sort(arr);
          for(int i=0;i<arr.length-1;i++) {
                if(arr[i].equals(arr[i+1]))
                      return false;
          }
          return true;
    }
    
    public String getRandomWordFromWordList() {
    	Random generator = new Random();
    	//ArrayList<String> randomValue = (ArrayList<String>)values[generator.nextInt(values.length)];
    	return wordList.get(generator.nextInt(wordList.size()));
    }
	

	public boolean isWordInDic(String word) {
		return allWords.contains(word);
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
			arr1[c-'A']=true;
		for(char c:word2.toCharArray())
			arr2[c-'A']=true;
		for(int i=0;i<26;i++) {
			if(arr1[i]&&arr2[i])
				matches++;
		}
		return matches;
	}


}
