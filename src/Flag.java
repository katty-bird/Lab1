
public class Flag {
	
	public static void main (String[] args) {
		String outputLine;  
		for (int row = 1; row <= 40; row++){      
		    outputLine = "";      
		    for (int column = 1; column <= 40; column++){
		        outputLine = outputLine+determineCharacter (column, row);
		    }      
		    System.out.println (outputLine);
		} 
	}
	
	public static char determineCharacter (int column, int row) {
		if (row <= 2 || row > 38 || column <=2 || column > 38) {
			return '?';
		}
		if  (2 < row && row < 17) {
			if (column < 17 && (column + row % 3) % 3 == 0) {
				return '/';
			}
			if (column < 17 && (column + row % 3) % 3 == 1) {
				return '=';
			}
			if (column == 17) {
				return '|';
			}
		}
		if  (row == 17 && column < 18) {
			return '-';
		}
		if (row == -column + 41) {
			return '+';
		}
		if  (row > 17 || column > 17) {
			if (column % 5 == 0 && row < -column +41) {
				return '(';
			}
			if (row % 3 == 0 && row > -column +41) {
				return '(';
			}
		}
		
	return ' ';
	}
}
