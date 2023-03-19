import java.util.ArrayList;

public class Movement {
    private String name;
    private String color;
    private int PositionX;
    private int PositionY;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index;
    private Object chessman;

    public Object getChessman() {
        return chessman;
    }

    public void setChessman(Object chessman) {
        this.chessman = chessman;
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

    public int getPositionX() {
        return PositionX;
    }

    public void setPositionX(int newPositionX) {
        this.PositionX = newPositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public void setPositionY(int newPositionY) {
        this.PositionY = newPositionY;
    }

    public Object getPiece(String name, ArrayList<Pawn> whitePawns, ArrayList<Pawn> blackPawns, ArrayList<Knight> whiteKnights, ArrayList<Knight> blackKnights, ArrayList<Bishop> whiteBishops, ArrayList<Bishop> blackBishops, ArrayList<Rook> whiteRooks, ArrayList<Rook> blackRooks, ArrayList<Queen> blackQueen, ArrayList<Queen> whiteQueen, ArrayList<King> blackKing, ArrayList<King> whiteKing) {
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
                        return null;
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
                        return null;
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
                        return null;
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
                        return null;
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
                        return null;
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
                        return null;
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
                        return null;
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
                        return null;
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
                    return null;
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
                    return null;
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
        int finalPositionX =position[0];
        setPositionX(finalPositionX);

        // Set the final y position
        int finalPositionY = position[1];
        setPositionY(finalPositionY);

        //Set the index of the array
        setIndex(index);

        //Set the object
        setChessman(chessman);

        if (position[0] == 10) {
            return null;
        } else
            return chessman;
    }


}