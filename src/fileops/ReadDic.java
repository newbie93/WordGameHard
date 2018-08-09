package fileops;



import java.io.BufferedReader;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import util.WordUtil;


public class ReadDic {

	private static final String DIC_FILE="/Users/righosh/Downloads/sowpods.txt";

	private int length;
	private ArrayList<String> wordList;
	private ArrayList<String> allWords;

	public ReadDic(int length) {
		this.length=length;
		wordList=new ArrayList<>();
		allWords=new ArrayList<>();
		createWordList();
	}


	public void createWordList(){
		String str,hashValue;
		ArrayList<String> al;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(DIC_FILE)));
			while((str=br.readLine())!=null) {
				//System.out.println(str);
				if (str.length()==this.length) {
					allWords.add(str);
					if(WordUtil.containsOnlyUnique(str))
						wordList.add(str);
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String>getWordList() {
		return this.wordList;
	}
	
	public ArrayList<String>getAllWords() {
		return this.allWords;
	}



	public void display(Map<String,ArrayList<String>> map) {
		for(Map.Entry<String,ArrayList<String>> en:map.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}



	/*
	public static void main(String args[]) {

		ReadDic obj = new ReadDic();

		Map<String,ArrayList<String>>wordMap=obj.createWordList(5);

		obj.display(wordMap);

	}
	 */



}