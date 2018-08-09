
package game;

import util.WordUtil;

public class WordGame {

	private GameDifficulty gameDifficulty;

	private String hiddenWord;

	public WordGame(GameDifficulty gameDifficulty) {
		this.gameDifficulty=gameDifficulty;
	}

	/*do this after getting dicRead*/
	private void setRandomWord() {
		this.hiddenWord="";
	}

	private void takeWordFromUsr() {
		try {
			String word=WordUtil.takeInputWord();
			if(WordUtil.isValidWord(word))
				
		}
		catch(Exception e) {

		}

	}


}
