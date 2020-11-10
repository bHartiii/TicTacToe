import java.util.*;
public class TicTacToe{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                char playerInput= determineInput(scanner);
                char computerInput='X';
                if(playerInput=='X'){
                        computerInput='O';
                }
                char[] gameBoard=initializationGameBoard();
		displayBoard(gameBoard);
		moveToDesiredLocation(scanner,gameBoard,playerInput,computerInput);

        }
        public static char[] initializationGameBoard(){
                char[] playBoard=new char[10];
		for(int i=1;i<=9;i++){
			playBoard[i]=' ';
		}
                return playBoard;
        }
        public static char determineInput(Scanner scanner){
                System.out.println("Choose an input letter 1.'O' or 2.'X' : ");
                while(true){
                        int input=scanner.nextInt();
                        switch(input){
                        case 1:
                                return 'O';
                        case 2:
                                return 'X';
                        default:
                                System.out.println("Enter a correct input!");
                        }
                }

        }
        public static void displayBoard(char[] playBoard){
                for(int i=1;i<playBoard.length;i++){
                	System.out.print(playBoard[i]);
			System.out.print("|");

			if(i==3||i==6||i==9){
				System.out.println();
			}
                }
        }
	public static void moveToDesiredLocation(Scanner scanner,char[] playBoard,char userInput,char computerInput){
		System.out.println("Enter the position (1-9) : ");
                while(true){
			int userPosition = scanner.nextInt();
			if(playBoard[userPosition]==' '){
				 playBoard[userPosition]=userInput;
			}
			else{
				System.out.println(userPosition+" is Position taken");
			}
			Random random=new Random();
                	int computerPosition=random.nextInt(9);
			if(playBoard[computerPosition]==' '){
				playBoard[computerPosition]=computerInput;
			}
                	displayBoard(playBoard);

		}
	}
}
