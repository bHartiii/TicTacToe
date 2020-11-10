public class TicTacToe{
	public static void main(String[] args){
		char[][] playBoard = {{' ','|',' ','|',' '},
				{'-','-','-','-','-'},
				{' ','|',' ','|',' '},
				{'-','-','-','-','-'},
				{' ','|',' ','|',' '}};

	}
	public static void displayGameBoard(char[][] playBoard){
		for(char[] row:playBoard){
                       for(char element:row){
                               System.out.print(element);
                       }
                       System.out.println();
        	}

	}
}
