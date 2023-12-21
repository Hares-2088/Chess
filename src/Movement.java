import java.util.ArrayList;

public class Movement {
    private String name;
    private String color;
    private int newPositionX;
    private int newPositionY;
    private int index;
    private Object movingChessman;
    private boolean ifMove;

    public boolean isIfMove() {
        return ifMove;
    }

    public void setIfMove(boolean ifMove) {
        this.ifMove = ifMove;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getMovingChessman() {
        return movingChessman;
    }

    public void setMovingChessman(Object movingChessman) {
        this.movingChessman = movingChessman;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNewPositionX() {
        return newPositionX;
    }

    public void setNewPositionX(int newPositionX) {
        this.newPositionX = newPositionX;
    }

    public int getNewPositionY() {
        return newPositionY;
    }

    public void setNewPositionY(int newPositionY) {
        this.newPositionY = newPositionY;
    }

    //Will find the piece and set all its attributes
    //The positions, the name, the color, the index, the type of piece and finally will create an object of it and set it in moving chessman
    public void setAttributesByName(String name, ArrayList<Pawn> whitePawns, ArrayList<Pawn> blackPawns, ArrayList<Knight> whiteKnights, ArrayList<Knight> blackKnights, ArrayList<Bishop> whiteBishops, ArrayList<Bishop> blackBishops, ArrayList<Rook> whiteRooks, ArrayList<Rook> blackRooks, ArrayList<Queen> blackQueen, ArrayList<Queen> whiteQueen, ArrayList<King> blackKing, ArrayList<King> whiteKing) {
        int[] position = {10, 10};
        int index = 0;
        String chessmanType = null;
        String chessmanColor = null;
        Object chessman = null;

        for (int row = 0; row < 8; row++) {
            //Check Pawns
            //check if is alive
            for (int p = 0; p < whitePawns.size(); p++) {
                //Check White Pawns
                if (whitePawns.get(p).getName().equalsIgnoreCase(name)) {
                    if (whitePawns.get(p).isAlive()) {
                        position[0] = whitePawns.get(p).getPositionX();
                        position[1] = whitePawns.get(p).getPositionY();
                        chessmanType = "Pawn";
                        chessmanColor = "White";
                        chessman = whitePawns.get(p);
                        index = p;
                    } else
                        setIfMove(false);
                }

                //Check Black Pawns
                //check if is alive
                if (blackPawns.get(p).getName().equalsIgnoreCase(name)) {
                    if (blackPawns.get(p).isAlive()) {
                        position[0] = blackPawns.get(p).getPositionX();
                        position[1] = blackPawns.get(p).getPositionY();
                        chessmanType = "Pawn";
                        chessmanColor = "Black";
                        chessman = blackPawns.get(p);
                        index = p;
                    } else
                        setIfMove(false);
                }
            }
            //Knights, Bishops and Rooks
            for (int k = 0; k < 2; k++) {
                //Check White Knights
                if (whiteKnights.get(k).getName().equalsIgnoreCase(name)) {
                    if (whiteKnights.get(k).isAlive()) {
                        position[0] = whiteKnights.get(k).getPositionX();
                        position[1] = whiteKnights.get(k).getPositionY();
                        chessmanType = "Knight";
                        chessmanColor = "White";
                        chessman = whiteKnights.get(k);
                        index = k;
                    } else
                        setIfMove(false);
                }

                //Check Black Knights
                if (blackKnights.get(k).getName().equalsIgnoreCase(name)) {
                    if (blackKnights.get(k).isAlive()) {
                        position[0] = blackKnights.get(k).getPositionX();
                        position[1] = blackKnights.get(k).getPositionY();
                        chessmanType = "Knight";
                        chessmanColor = "Black";
                        chessman = blackKnights.get(k);
                        index = k;
                    } else
                        setIfMove(false);
                }

                //Check White Bishops
                if (whiteBishops.get(k).getName().equalsIgnoreCase(name)) {
                    if (whiteBishops.get(k).isAlive()) {
                        position[0] = whiteBishops.get(k).getPositionX();
                        position[1] = whiteBishops.get(k).getPositionY();
                        chessmanType = "Bishop";
                        chessmanColor = "White";
                        chessman = whiteBishops.get(k);
                        index = k;
                    } else
                        setIfMove(false);
                }

                //Check Black Bishops
                if (blackBishops.get(k).getName().equalsIgnoreCase(name)) {
                    if (blackBishops.get(k).isAlive()) {
                        position[0] = blackBishops.get(k).getPositionX();
                        position[1] = blackBishops.get(k).getPositionY();
                        chessmanType = "Bishop";
                        chessmanColor = "Black";
                        chessman = blackBishops.get(k);
                        index = k;
                    } else
                        setIfMove(false);
                }

                //Check White Rooks
                if (whiteRooks.get(k).getName().equalsIgnoreCase(name)) {
                    if (whiteRooks.get(k).isAlive()) {
                        position[0] = whiteRooks.get(k).getPositionX();
                        position[1] = whiteRooks.get(k).getPositionY();
                        chessmanType = "Rook";
                        chessmanColor = "White";
                        chessman = whiteRooks.get(k);
                        index = k;
                    } else
                        setIfMove(false);
                }


                //Check Black Rooks
                if (blackRooks.get(k).getName().equalsIgnoreCase(name)) {
                    if (blackRooks.get(k).isAlive()) {
                        position[0] = blackRooks.get(k).getPositionX();
                        position[1] = blackRooks.get(k).getPositionY();
                        chessmanType = "Rook";
                        chessmanColor = "Black";
                        chessman = blackRooks.get(k);
                        index = k;
                    } else
                        setIfMove(false);
                }
            }

            //Check White Queen
            if (whiteQueen.get(0).getName().equalsIgnoreCase(name)) {
                if (whiteQueen.get(0).isAlive()) {
                    position[0] = whiteQueen.get(0).getPositionX();
                    position[1] = whiteQueen.get(0).getPositionY();
                    chessmanType = "Queen";
                    chessmanColor = "White";
                    chessman = whiteQueen.get(0);
                    index = 0;
                } else
                    setIfMove(false);
            }

            //Check Black Queen
            if (blackQueen.get(0).getName().equalsIgnoreCase(name)) {
                if (blackQueen.get(0).isAlive()) {
                    position[0] = blackQueen.get(0).getPositionX();
                    position[1] = blackQueen.get(0).getPositionY();
                    chessmanType = "Queen";
                    chessmanColor = "Black";
                    chessman = blackQueen.get(0);
                    index = 0;
                } else
                    setIfMove(false);
            }
            if (whiteKing.get(0).getName().equalsIgnoreCase(name)) {
                position[0] = whiteKing.get(0).getPositionX();
                position[1] = whiteKing.get(0).getPositionY();
                chessmanType = "King";
                chessmanColor = "White";
                chessman = whiteKing.get(0);
                index = 0;
            }
            //Check Black King
            if (blackKing.get(0).getName().equalsIgnoreCase(name)) {
                position[0] = blackKing.get(0).getPositionX();
                position[1] = blackKing.get(0).getPositionY();
                chessmanType = "King";
                chessmanColor = "Black";
                chessman = blackKing.get(0);
                index = 0;
            }
        }

        // Set the color
        String pieceColor = chessmanColor;
        setColor(pieceColor);

        // Set the name
        String pieceName = chessmanType;
        setName(pieceName);

        // Set the final x position
        int finalPositionX = position[0];
        setNewPositionX(finalPositionX);

        // Set the final y position
        int finalPositionY = position[1];
        setNewPositionY(finalPositionY);

        //Set the index of the array
        setIndex(index);

        //Set the object
        setMovingChessman(chessman);

        if (position[0] == 10) {
            setIfMove(false);
        } else
            setIfMove(true);
    }

    //Defines all the movement possibilities of the pawns and will set the new positions
    public void pawnMovement(int turn, int nextX, int nextY) {
        if (nextX == getNewPositionX() && nextY == (getNewPositionY() + 1)) {
            setNewPositionY(nextY);
            setNewPositionX(nextX);
        } else if ((turn == 1) && nextX == getNewPositionX() && nextY == (getNewPositionY() + 2)) {
            setNewPositionY(nextY);
            setNewPositionX(nextX);
        } else
            System.out.println("The position that you gave is not valid");
    }

    //function that will set the new positions for the right piece
    public void move(int turn, int nextX, int nextY, ArrayList<Pawn> whitePawns, ArrayList<Pawn> blackPawns, ArrayList<Knight> whiteKnights, ArrayList<Knight> blackKnights, ArrayList<Bishop> whiteBishops, ArrayList<Bishop> blackBishops, ArrayList<Rook> whiteRooks, ArrayList<Rook> blackRooks, ArrayList<Queen> blackQueen, ArrayList<Queen> whiteQueen, ArrayList<King> blackKing, ArrayList<King> whiteKing) {
        //Pawns
        if (getName().equalsIgnoreCase("Pawn") && getColor().equalsIgnoreCase("white")) {
            pawnMovement(turn, nextX, nextY);
            whitePawns.get(getIndex()).setPositionY(getNewPositionY());
            whitePawns.get(getIndex()).setPositionX(getNewPositionX());
        }
        if (getName().equalsIgnoreCase("Pawn") && getColor().equalsIgnoreCase("black")) {
            pawnMovement(turn, nextX, nextY);
            blackPawns.get(getIndex()).setPositionY(getNewPositionY());
            blackPawns.get(getIndex()).setPositionX(getNewPositionX());
        }
        //Rooks
        if (getName().equalsIgnoreCase("Rook") || getColor().equalsIgnoreCase("white")) {
            whiteRooks.get(getIndex()).setPositionY(getNewPositionY());
            whiteRooks.get(getIndex()).setPositionX(getNewPositionX());
        }
        if (getName().equalsIgnoreCase("Rook") || getColor().equalsIgnoreCase("black")) {
            blackRooks.get(getIndex()).setPositionY(getNewPositionY());
            blackRooks.get(getIndex()).setPositionX(getNewPositionX());
        }
        //Knights
        if (getName().equalsIgnoreCase("Knight") || getColor().equalsIgnoreCase("white")) {
            whiteKnights.get(getIndex()).setPositionY(getNewPositionY());
            whiteKnights.get(getIndex()).setPositionX(getNewPositionX());
        }
        if (getName().equalsIgnoreCase("Knight") || getColor().equalsIgnoreCase("black")) {
            blackKnights.get(getIndex()).setPositionY(getNewPositionY());
            blackKnights.get(getIndex()).setPositionX(getNewPositionX());
        }
        //Bishops
        if (getName().equalsIgnoreCase("Bishop") || getColor().equalsIgnoreCase("white")) {
            whiteBishops.get(getIndex()).setPositionY(getNewPositionY());
            whiteBishops.get(getIndex()).setPositionX(getNewPositionX());
        }
        if (getName().equalsIgnoreCase("Bishop") || getColor().equalsIgnoreCase("black")) {
            blackBishops.get(getIndex()).setPositionY(getNewPositionY());
            blackBishops.get(getIndex()).setPositionX(getNewPositionX());
        }
        //Queen
        if (getName().equalsIgnoreCase("queen") || getColor().equalsIgnoreCase("white")) {
            whiteQueen.get(getIndex()).setPositionY(getNewPositionY());
            whiteQueen.get(getIndex()).setPositionX(getNewPositionX());
        }
        if (getName().equalsIgnoreCase("queen") || getColor().equalsIgnoreCase("black")) {
            blackQueen.get(getIndex()).setPositionY(getNewPositionY());
            blackQueen.get(getIndex()).setPositionX(getNewPositionX());
        }
        //King
        if (getName().equalsIgnoreCase("King") || getColor().equalsIgnoreCase("white")) {
            whiteKing.get(getIndex()).setPositionY(getNewPositionY());
            whiteKing.get(getIndex()).setPositionX(getNewPositionX());
        }
        if (getName().equalsIgnoreCase("King") || getColor().equalsIgnoreCase("black")) {
            blackKing.get(getIndex()).setPositionY(getNewPositionY());
            blackKing.get(getIndex()).setPositionX(getNewPositionX());
        }
    }

}