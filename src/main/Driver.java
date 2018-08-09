package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import display.Menu;
import game.GameDifficulty;
import game.WordGame;
import util.WordUtil;

public class Driver {
	
	public static GameDifficulty takeDifficultyInput() {
		int choice;
		try {
			choice=Integer.parseInt(WordUtil.takeInputWord());
			if(choice<1 || choice>0)
				return null;
		}
		catch(Exception e) {
			return null;
		}
		return null;
	}
	
	public static void startGame() {
		Menu.welcome();
		GameDifficulty gameDifficulty=null;
		while((gameDifficulty=takeDifficultyInput())!=null);
		WordGame wordGame=new WordGame(gameDifficulty);
	}

}
