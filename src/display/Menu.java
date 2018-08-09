package display;

public class Menu {

	private static final String ASK_WORD="Throw a word...!";
	private static final String NONE_PRESENT="No charater present!";
	private static final String ONE_PRESENT="1 charater present!";
	private static final String TWO_PRESENT="2 charaters present!";
	private static final String THREE_PRESENT="3 charaters present!";
	private static final String FOUR_PRESENT="4 charaters present!";
	private static final String FIVE_PRESENT="5 charaters present!";
	private static final String SIX_PRESENT="6 charaters present!";
	private static final String WELCOME_MSG="Welcome to word Game!";
	private static final String DIFF_LEVEL="Enter 1 for EASY, 2 for MODERATE and 3 for HARD";
	private static final String COMP_WIN="I win! Better luck next time... :)";
	private static final String HUMAN_WINS="You Win! Congratulations... :)";
	private static final String CHOOSE_COMP="I CHOOSE: ";
	private static final String ASK_MATCHING_CHARACTERS="Please tell how many matching characters are there!";


	public static void displayWelcome() {
		System.out.println(WELCOME_MSG);
	}
	
	public static void displayComputersChoice(String s){
		System.out.println(CHOOSE_COMP+s);
	}
	
	public static void displayAskForMatchingCharacters(){
		System.out.println(ASK_MATCHING_CHARACTERS);
	}

	public static void displayDifficultyLevel() {
		System.out.println(DIFF_LEVEL);
	}

	public static void displayAskForWord() {
		System.out.println(ASK_WORD);
	}

	public static void displayCharFreqFeedback(int n) {
		switch(n) {
		case 0:
			System.out.println(NONE_PRESENT);
			break;
		case 1:
			System.out.println(ONE_PRESENT);
			break;
		case 2:
			System.out.println(TWO_PRESENT);
			break;
		case 3:
			System.out.println(THREE_PRESENT);
			break;
		case 4:
			System.out.println(FOUR_PRESENT);
			break;
		case 5:
			System.out.println(FIVE_PRESENT);
			break;
		case 6:
			System.out.println(SIX_PRESENT);
			break;
		default: ;
		}
	}
	
	public static void displayComputerWins() {
		System.out.println(COMP_WIN);
	}
	
	public static void displayHumanWins() {
		System.out.println(HUMAN_WINS);
	}
	
	


}
