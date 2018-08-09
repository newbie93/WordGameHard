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
	
	private void start() {
		Menu.displayWelcome();
	}
	
	
	public void playGame() {
		int matches;
		String word;
		while(wordGame.getGameState()==GameState.InProgress) {
			
		}
		if(wordGame.getGameState()==GameState.ComputerWins)
			Menu.displayComputerWins();
		else
			Menu.displayHumanWins();
	}
	
	

}
