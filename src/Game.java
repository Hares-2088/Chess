import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String pieceName;

        Board board = new Board();
        Pawn pawn = new Pawn();
        Knight knight = new Knight();
        Bishop bishop = new Bishop();
        Rook rook = new Rook();
        King king = new King();
        Queen queen = new Queen();
        Movement movement = new Movement();

        Scanner sc = new Scanner(System.in);

        //Create arraylist for pawns
        //white
        ArrayList<Pawn> whitePawns = new ArrayList<>();
        pawn.createWhitePawns(board, whitePawns);
        //Black
        ArrayList<Pawn> blackPawns = new ArrayList<>();
        pawn.createBlackPawns(board, blackPawns);

        //Create arraylist for knights
        //white
        ArrayList<Knight> whiteKnights = new ArrayList<>();
        knight.createWhiteKnights(whiteKnights);
        //Black
        ArrayList<Knight> blackKnights = new ArrayList<>();
        knight.createBlackKnights(blackKnights);

        //Create arraylist for Bishops
        //white
        ArrayList<Bishop> whiteBishops = new ArrayList<>();
        bishop.createWhiteBishops(whiteBishops);
        //Black
        ArrayList<Bishop> blackBishops = new ArrayList<>();
        bishop.createBlackBishops(blackBishops);

        //Create arraylist for Rooks
        //white
        ArrayList<Rook> whiteRooks = new ArrayList<>();
        rook.createWhiteRooks(whiteRooks);
        //Black
        ArrayList<Rook> blackRooks = new ArrayList<>();
        rook.createBlackRooks(blackRooks);

        //Create arraylist for Queen
        //white
        ArrayList<Queen> whiteQueen = new ArrayList<>();
        queen.createWhiteQueen(whiteQueen);
        //Black
        ArrayList<Queen> blackQueen = new ArrayList<>();
        queen.createBlackQueen(blackQueen);

        //Create arraylist for King
        //white
        ArrayList<King> whiteKing = new ArrayList<>();
        king.createWhiteKing(whiteKing);
        //Black
        ArrayList<King> blackKing = new ArrayList<>();
        king.createBlackKing(blackKing);

        int turn=1;
        while (true) {
            //Printing the board
            board.printBoard(whitePawns, blackPawns, whiteKnights, blackKnights, whiteBishops, blackBishops, whiteRooks, blackRooks,
                    whiteQueen, blackQueen, whiteKing, blackKing);

            //Asking the user the name of the piece
            System.out.println("What is the name of the piece that you want to move: ");
            pieceName = sc.nextLine();

            //Check if the piece is still alive and ask the user to give an alive one until true
            while (movement.getPieceByName(pieceName, whitePawns, blackPawns, whiteKnights, blackKnights, whiteBishops, blackBishops, whiteRooks, blackRooks, whiteQueen, blackQueen, whiteKing, blackKing) == null) {
                System.out.println("This piece does not exit or is dead");
                System.out.println("What is the name of the piece that you want to move: ");
                pieceName = sc.nextLine();
            }
            System.out.println("Where do you want to move it: (ex:G5)");
            String nextPosition = sc.nextLine();
            String
            movement.move(turn, );
        }

    }
    public static int getNumberFromLetter(String upperCaseLetter){
        String lowerLetter = upperCaseLetter.toLowerCase();
        char letter = lowerLetter.charAt(0);
        int index = 0;
        switch (letter){
            case 'a':
                index = 0;
                break;
            case 'b':
                index = 1;
                break;
            case 'c':
                index = 2;
                break;
            case 'd':
                index = 3;
                break;
            case 'e':
                index = 4;
                break;
            case 'f':
                index = 5;
                break;
            case 'g':
                index = 6;
                break;
            case 'h':
                index = 7;
                break;
        }
        return index;
    }
}