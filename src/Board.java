import java.util.ArrayList;

public class Board {
    //Create a matrix to print my chess board
    private String[][] boardPositions = new String[8][8];

    public String[][] getBoardPositions() {
        return boardPositions;
    }

    public void setBoardPositions(String[][] boardPositions) {
        this.boardPositions = boardPositions;
    }

    public void setChessman(int x, int y, String chessman) {
        this.boardPositions[x][y] = chessman;
    }

    public void printBoard(ArrayList<Pawn> whitePawns, ArrayList<Pawn> blackPawns, ArrayList<Knight> whiteKnights, ArrayList<Knight> blackKnights, ArrayList<Bishop> whiteBishops, ArrayList<Bishop> blackBishops, ArrayList<Rook> whiteRooks, ArrayList<Rook> blackRooks, ArrayList<Queen> blackQueen, ArrayList<Queen> whiteQueen, ArrayList<King> blackKing, ArrayList<King> whiteKing) {
        //Create an Array to hold the letters
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int[] numbers = {1,2,3,4,5,6,7,8};
        //Associate the name with the board index
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                for (int p = 0; p < whitePawns.size(); p++) {
                    //Check White Pawns
                    if (whitePawns.get(p).getPositionX() == row && whitePawns.get(p).getPositionY() == col) {
                        boardPositions[row][col] = whitePawns.get(p).getName();
                    }
                    //Check Black Pawns
                    if (blackPawns.get(p).getPositionX() == row && blackPawns.get(p).getPositionY() == col) {
                        boardPositions[row][col] = blackPawns.get(p).getName();
                    }
                }
                //Knights, Bishops and Rooks
                for (int k = 0; k < 2; k++) {
                    //Check White Knights
                    if ((whiteKnights.get(k).getPositionX() == row) && (whiteKnights.get(k).getPositionY() == col)) {
                        boardPositions[row][col] = whiteKnights.get(k).getName();
                    }
                    //Check Black Knights
                    if ((blackKnights.get(k).getPositionX() == row) && (blackKnights.get(k).getPositionY() == col)) {
                        boardPositions[row][col] = blackKnights.get(k).getName();
                    }
                    //Check White Bishops
                    if ((whiteBishops.get(k).getPositionX() == row) && (whiteBishops.get(k).getPositionY() == col)) {
                        boardPositions[row][col] = whiteBishops.get(k).getName();
                    }
                    //Check Black Bishops
                    if ((blackBishops.get(k).getPositionX() == row) && (blackBishops.get(k).getPositionY() == col)) {
                        boardPositions[row][col] = blackBishops.get(k).getName();
                    }
                    //Check White Rooks
                    if ((whiteRooks.get(k).getPositionX() == row) && (whiteRooks.get(k).getPositionY() == col)) {
                        boardPositions[row][col] = whiteRooks.get(k).getName();
                    }
                    //Check Black Rooks
                    if ((blackRooks.get(k).getPositionX() == row) && (blackRooks.get(k).getPositionY() == col)) {
                        boardPositions[row][col] = blackRooks.get(k).getName();
                    }
                }
                //Check White Queen
                if ((whiteQueen.get(0).getPositionX() == row) && (whiteQueen.get(0).getPositionY() == col)) {
                    boardPositions[row][col] = whiteQueen.get(0).getName();
                }
                //Check Black Queen
                if ((blackQueen.get(0).getPositionX() == row) && (blackQueen.get(0).getPositionY() == col)) {
                    boardPositions[row][col] = blackQueen.get(0).getName();
                }

                //Check White King
                if ((whiteKing.get(0).getPositionX() == row) && (whiteKing.get(0).getPositionY() == col)) {
                    boardPositions[row][col] = whiteKing.get(0).getName();
                }
                //Check Black King
                if ((blackKing.get(0).getPositionX() == row) && (blackKing.get(0).getPositionY() == col)) {
                    boardPositions[row][col] = blackKing.get(0).getName();
                }

            }
        }
        //Put the number
        System.out.print("      ");
        for (int i= 0; i<8; i++){
            if (i ==7){
                System.out.println(numbers[i]);
                System.out.println();
            }
            else {
                System.out.printf("%-10d", numbers[i]);
            }
        }
        //Print the board
        for (int row = 0; row < boardPositions.length; row++) {
            //put the letters
            System.out.print(letters[row]+ "    ");
            for (int col = 0; col < boardPositions[row].length; col++) {
                if (boardPositions[row][col] == null) {
                    System.out.printf("%-10s", "Blank");
                } else
                    System.out.printf("%-10s", boardPositions[row][col]);
            }
            System.out.println(letters[row]);
            System.out.println();
            System.out.println();
        }
        //Put the number
        System.out.print("      ");
        for (int i= 0; i<8; i++){
            if (i ==7){
                System.out.println(numbers[i]);
            }
            else {
                System.out.printf("%-10d", numbers[i]);
            }
        }
    }
}



