package practice.easy;

import java.util.ArrayList;

public class OneDArrayP2 {

	public static void main(String[] args) {
		gameGame(new int[] { 0, 0, 0, 0, 0 }, 3);
		gameGame(new int[] { 0, 0, 0, 1, 1, 1 }, 5);
		gameGame(new int[] { 0, 0, 1, 1, 1, 0 }, 3);
		gameGame(new int[] { 0, 1, 0 }, 1);
	}

	static void gameGame(int[] game, int leap) {
		boolean win = true;
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 1 && game[i - 1] == 0) {
				int count = countOnes(game, i);
				if (leap <= count) win = false;
			}
		}
		if (win) System.out.println("YES");
		if (!win) System.out.println("NO");
	}
	
	static int countOnes(int[] game, int idx) {
		int count = 1;
		for (int i = idx; i < game.length + 1 - i; i++) {
			if (game[i] == 1) count++;
			else return count;
		}
		return count;
	}
	
	public static boolean canWin(int leap, int[] game) {
	    return isSolvable(leap, game, 0);
	}

	private static boolean isSolvable(int leap, int[] game, int i) {
	    // Base Cases
	    if (i >= game.length) {
	        return true;
	    } else if (i < 0 || game[i] == 1) {
	        return false;
	    }
	            
	    game[i] = 1; // marks as visited

	    // Recursive Cases
	    return isSolvable(leap, game, i + leap) || 
	           isSolvable(leap, game, i + 1) || 
	           isSolvable(leap, game, i - 1);
	}

}
