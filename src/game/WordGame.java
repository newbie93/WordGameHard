
package game;

import java.util.ArrayList;
import java.util.Random;

import util.WordUtil;

public class WordGame {
	
	public static final int HIDDEN_WORD_FOUND=1000;

	private GameState gameState;
	private GameDifficulty gameDifficulty;
	private String hiddenWord;
	public WordUtil wordUtil;

	public WordGame(GameDifficulty gameDifficulty) {
		this.gameDifficulty=gameDifficulty;
		this.gameState=GameState.InProgress;
		this.wordUtil=new WordUtil(gameDifficulty.getValue());
		this.hiddenWord=wordUtil.getRandomWordFromWordList();
		System.out.println(hiddenWord);
	}
	
	public GameState getGameState() {
		return gameState;
	}

	public GameDifficulty getGameDifficulty() {
		return gameDifficulty;
	}
	
	private void setHumanWinner() {
		this.gameState=GameState.HumanWins;
	}
	
	public void setComputerWinner() {
		this.gameState=GameState.ComputerWins;
	}
	
	
	
	public String chooseComputersClue(){
		return wordUtil.getRandomWordFromWordList();
	}

	public int processWordClueByUser(String word) {
		if(!wordUtil.isWordInDic(word))
			return -1;
		if(word.equalsIgnoreCase(hiddenWord)) {
			setHumanWinner();
			return HIDDEN_WORD_FOUND;
		}
		return WordUtil.matchingChars(word, hiddenWord);
	}

}
