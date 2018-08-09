package main;


import display.Menu;
import game.GameDifficulty;
import game.GameState;
import game.WordGame;
import util.WordUtil;

public class Driver {

	private WordGame wordGame;
	
	public Driver(int gameDiff) {
		this.wordGame=new WordGame(GameDifficulty.valueOf(gameDiff));
	}
	
	public int processInput() throws Exception {
		Menu.displayAskForWord();
		int val=-1;
		while((val=wordGame.processWordClueByUser(WordUtil.takeInputWord()))<0);
		return val;
	}
	
	public void playGame() throws Exception {
		int val;
		Menu.displayWelcome();
		while(wordGame.getGameState()==GameState.InProgress) {
			val=processInput();
			if(val==WordGame.HIDDEN_WORD_FOUND)
				continue;
			Menu.displayCharFreqFeedback(val);
			String chosenWord = wordGame.chooseComputersClue();
			Menu.displayComputersChoice(chosenWord);
			Menu.displayAskForMatchingCharacters();
			String userInput = WordUtil.takeInputWord();
			if(userInput.equals("CORRECT")){
				wordGame.setComputerWinner();
				continue;
			}
			int matchingCharacters = Integer.parseInt(userInput);
			wordGame.wordUtil.updateWordList(matchingCharacters,chosenWord);
			/*
			 * 	give a word ask for matches...
			 * */
		}
		if(wordGame.getGameState()==GameState.ComputerWins)
			Menu.displayComputerWins();
		else
			Menu.displayHumanWins();
	}
	
	

}
