
package game;

import util.WordUtil;

public class WordGame {

	private GameState gameState;
	private GameDifficulty gameDifficulty;
	private String hiddenWord;
	private WordUtil wordUtil;
	
	public GameState getGameState() {
		return gameState;
	}

	public GameDifficulty getGameDifficulty() {
		return gameDifficulty;
	}

	public WordGame(GameDifficulty gameDifficulty) {
		this.gameDifficulty=gameDifficulty;
		this.gameState=GameState.InProgress;
		this.wordUtil=new WordUtil(gameDifficulty);
		this.hiddenWord=wordUtil.getRandomWordFromMap();
	}
	
	private void setHumanWinner() {
		this.gameState=GameState.HumanWins;
	}
	
	private void setComputerWinner() {
		this.gameState=GameState.ComputerWins;
	}

	private int processWordClueByUser(String word) {
		if(!wordUtil.isWordInDic(word))
			return -1;
		if(word.equalsIgnoreCase(hiddenWord)) {
			setHumanWinner();
			return 1000;
		}
		return WordUtil.matchingChars(word, hiddenWord);
	}

}
