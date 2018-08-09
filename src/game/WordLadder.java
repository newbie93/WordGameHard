package game;

import java.io.BufferedReader;
import java.util.Random;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class WordLadder
{   


	public int answer(String a, String b){
		boolean[] check = new boolean[26];
		for(int i=0;i<a.length();i++){
			for (int j=0;j<b.length();j++){
				if(a.charAt(i)==b.charAt(j))
					check[a.charAt(i)-65]=true;
			}
		}
		int ans = 0;
		for(int i=0;i<26;i++)
			if(check[i])
				ans++;
		return ans;
	}

	public void recursive(ArrayList<String> words, String checkWord){
		System.out.println(words);
		Random rand = new Random();
		int n = rand.nextInt(words.size());
		System.out.println(words.get(n));
		if(words.get(n).equals(checkWord)){
			return;
		}
		int ans = answer(checkWord, words.get(n));
		ArrayList<String> newWords =  new ArrayList<>();
		for(int i=0;i<words.size();i++)
			if(n!=i)
				if(ans == answer(words.get(i),words.get(n))){
					newWords.add(words.get(i));
				}
		recursive(newWords, checkWord);
	}

	static public boolean ifDistinct(String a){
		boolean[] myIntArray = new boolean[26];
		for(int i=0;i<26;i++){
			myIntArray[i]=false;
		}
		for(char c: a.toCharArray()){
			if(myIntArray[c-65])
				return false;
			else
				myIntArray[c-65]=true;
		}
		return true;
	}
	public static void main(String[] a) throws IOException {
		ArrayList<String> words = new ArrayList<>();

		boolean[] myIntArray = new boolean[26];
		for(int i=0;i<26;i++){
			myIntArray[i]=false;
		}

		File file=new File("sowpods.txt");
		BufferedReader rdr=new BufferedReader(new FileReader(file));
		String line="";

		while((line=rdr.readLine())!=null){
			line = line.trim();
			if(line.length()==5 && ifDistinct(line))
				words.add(line);
		}
		String checkWord = "LINES";
		WordLadder wl = new WordLadder();
		wl.recursive(words, checkWord);       
	}
}
