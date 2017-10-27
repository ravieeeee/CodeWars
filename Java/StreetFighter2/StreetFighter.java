
public class StreetFighter {
	public static String[] streetFighterSelection(String[][] fighters, 
			int[] position, String[] moves) {
		String[] solution = new String[moves.length];
		int[] hrMove = new int[moves.length];
		int[] vrMove = new int[moves.length];
		
		for (int i = 0; i < moves.length; i++) {
			String move = moves[i];
			switch (move) {
				case "up":
					if (i == 0) {
						vrMove[0] = position[1];
						hrMove[0] = position[0] == 0? 0: position[0]-1;
					} else {
						vrMove[i] = vrMove[i-1];
						hrMove[i] = hrMove[i-1] == 0? 0: hrMove[i-1]-1;
					}
					break;
				case "down":
					if (i == 0) {
						vrMove[0] = position[1];
						hrMove[0] = position[0] == fighters.length-1? 
								position[0]: position[0]+1;
					} else {
						vrMove[i] = vrMove[i-1];
						hrMove[i] = hrMove[i-1] == fighters.length-1? 
								hrMove[i-1]: hrMove[i-1]+1;
					}
					break;
				case "left":
					if (i == 0) {
						vrMove[0] = position[1] == 0? fighters[0].length-1: position[1]-1;
						hrMove[0] = position[0];
					} else {
						vrMove[i] = vrMove[i-1] == 0? fighters[0].length-1:vrMove[i-1]-1;
						hrMove[i] = hrMove[i-1];
					}
					break;
				case "right":
					if (i == 0) {
						vrMove[0] = position[1] == fighters[0].length-1?
								0: position[1]+1;
						hrMove[0] = position[0];
					} else {
						vrMove[i] = vrMove[i-1] == fighters[0].length-1? 
								0:vrMove[i-1]+1;
						hrMove[i] = hrMove[i-1];
					}
					break;
			}
			solution[i] = fighters[hrMove[i]][vrMove[i]];
		}	
		return solution;
	}
}
