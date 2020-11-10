import java.util.*;
public class TicTacToe{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                char playerInput= determineInput(scanner);
                char computerInput='X';
                if(playerInput=='X'){
                        computerInput='O';
                }
                char[][] gameBoard=initializationGameBoard();
                //displayBoard(gameBoard);

        }
        public static char[][] initializationGameBoard(){
                char[][] playBoard = {{' ','|',' ','|',' '},
                                {'-','-','-','-','-'},
                                {' ','|',' ','|',' '},
                                {'-','-','-','-','-'},
                                {' ','|',' ','|',' '}};
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
        public static void displayBoard(char[][] playBoard){
                for(char[] row:playBoard){
                       for(char element:row){
                               System.out.print(element);
                       }
                       System.out.println();
                }
        }
}
