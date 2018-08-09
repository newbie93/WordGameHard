
package game;

import java.util.HashMap;
import java.util.Map;

public enum GameDifficulty {
	
	EASY(1),
	MODERATE(2),
	HARD(3); 
	
	private int value;
	private static Map map = new HashMap<>();

    private GameDifficulty(int value) {
        this.value = value;
    }

    static {
        for (GameDifficulty gameDifficulty : GameDifficulty.values()) {
            map.put(gameDifficulty.value, gameDifficulty);
        }
    }

    public static GameDifficulty valueOf(int gameDiff) {
        return (GameDifficulty) map.get(gameDiff);
    }

    public int getValue() {
        return value;
    }
}
