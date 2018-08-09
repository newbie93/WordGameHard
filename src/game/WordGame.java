
package game;

import util.WordUtil;

public class WordGame {

	private GameState gameState;
	private GameDifficulty gameDifficulty;
	private String hiddenWord;
	private WordUtil wordUtil;

	public WordGame(GameDifficulty gameDifficulty) {
		this.gameDifficulty=gameDifficulty;
		this.gameState=GameState.InProgress;
		System.out.println();
		this.wordUtil=new WordUtil(gameDifficulty.getValue());
		this.hiddenWord=wordUtil.getRandomWordFromMap();
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
	
	private void setComputerWinner() {
		this.gameState=GameState.ComputerWins;
	}

	public int processWordClueByUser(String word) {
		if(!wordUtil.isWordInDic(word))
			return -1;
		if(word.equalsIgnoreCase(hiddenWord)) {
			setHumanWinner();
			return 1000;
		}
		return WordUtil.matchingChars(word, hiddenWord);
	}

}
