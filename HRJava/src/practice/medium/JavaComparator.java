package practice.medium;

import java.lang.reflect.Field;

public class JavaComparator {

	/*
	 * given five Player objects in an array, sort them in descending order of score using the Java Comparator interface
	 */
	
	static Object[] arr0;

	static class Player {

		String className;
		int classScore;

		public Player(String objName, int objScore) {
			this.className = objName;
			this.classScore = objScore;
		}

	}

	public static void main(String[] args) {

		Player pl0 = new Player("amy",100);
		Player pl1 = new Player("david",100);
		Player pl2 = new Player("heraldo",50);
		Player pl3 = new Player("aakansha",75);
		Player pl4 = new Player("aleksa",150);
		
		Object[] arr0 = new Object[] {pl0,pl1,pl2,pl3,pl4};		

	}

}
