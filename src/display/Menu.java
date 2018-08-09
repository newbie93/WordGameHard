package display;

public class Menu {

	private static final String ASK_WORD="Throw a word...!";
	private static final String NONE_PRESENT="None present!";
	private static final String ONE_PRESENT="1 present!";
	private static final String TWO_PRESENT="2 present!";
	private static final String THREE_PRESENT="3 present!";
	private static final String FOUR_PRESENT="4 present!";
	private static final String FIVE_PRESENT="5 present!";
	private static final String SIX_PRESENT="6 present!";
	private static final String WELCOME_MSG="Welcome to word Game!";
	private static final String DIFF_LEVEL="Enter 1 for EASY, 2 for MODERATE and 3 for HARD";


	public static void welcome() {
		System.out.println(WELCOME_MSG);
	}

	public static void difficultyLevel() {
		System.out.println(DIFF_LEVEL);
	}

	public static void askForWord() {
		System.out.println(ASK_WORD);
	}

	public static void giveCharFreqFeedback(int n) {
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


}
