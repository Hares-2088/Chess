import java.util.ArrayList;

public class Movement {
    private String name;
    private String color;
    private int PositionX;
    private int PositionY;

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

    public String[] getPiece(String name, ArrayList<Pawn> whitePawns, ArrayList<Pawn> blackPawns, ArrayList<Knight> whiteKnights, ArrayList<Knight> blackKnights, ArrayList<Bishop> whiteBishops, ArrayList<Bishop> blackBishops, ArrayList<Rook> whiteRooks, ArrayList<Rook> blackRooks, ArrayList<Queen> blackQueen, ArrayList<Queen> whiteQueen, ArrayList<King> blackKing, ArrayList<King> whiteKing) {
        int[] position = {10, 10};
        String chessmanType = null;
        String chessmanColor = null;

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
                    } else
                        return null;
                }
            }

            //Check White Queen
            if (whiteQueen.get(0).getName().equalsIgnoreCase(name)) {
                if (whiteQueen.get(0).isAlive()) {
                    position[0] = whiteKnights.get(0).getPositionX();
                    position[1] = whiteKnights.get(0).getPositionY();
                    chessmanType = "Queen";
                    chessmanColor = "White";
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
                } else
                    return null;
            }
            if (whiteKing.get(0).getName().equalsIgnoreCase(name)) {
                position[0] = blackQueen.get(0).getPositionX();
                position[1] = blackQueen.get(0).getPositionY();
                chessmanType = "King";
                chessmanColor = "White";
            }
            //Check Black King
            if (blackKing.get(0).getName().equalsIgnoreCase(name)) {
                position[0] = blackQueen.get(0).getPositionX();
                position[1] = blackQueen.get(0).getPositionY();
                chessmanType = "King";
                chessmanColor = "Black";
            }

        }
        String positionX = String.valueOf(position[0]);
        String positionY = String.valueOf(position[1]);
        String pieceData = chessmanColor + "," + chessmanType + "," + positionX + "," + positionY;
        String[] splitData = pieceData.split(",");

        // Set the color
        String pieceColor = splitData[0];
        setColor(pieceColor);

        // Set the name
        String pieceName = splitData[1];
        setName(pieceName);

        // Set the final x position
        int finalPositionX = Integer.parseInt(splitData[2]);
        setPositionX(finalPositionX);

        // Set the final y position
        int finalPositionY = Integer.parseInt(splitData[3]);
        setPositionY(finalPositionY);

        if (position[0] == 10) {
            return null;
        } else
            return splitData;
    }

    //Get the index of the white pawn
    public int getObjectWhitePawn(ArrayList<Pawn> whitePawns) {
        int index = 0;
        for (int i = 0; i < whitePawns.size(); i++) {
            if (whitePawns.get(i).getPositionX() == getPositionX() && whitePawns.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    public int getObjectBlackPawn(ArrayList<Pawn> blackPawns) {
        int index = 0;
        for (int i = 0; i < blackPawns.size(); i++) {
            if (blackPawns.get(i).getPositionX() == getPositionX() && blackPawns.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    public int getObjectWhiteRook(ArrayList<Rook> whiteRook) {
        int index = 0;
        for (int i = 0; i < whiteRook.size(); i++) {
            if (whiteRook.get(i).getPositionX() == getPositionX() && whiteRook.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    public int getObjectBlackRook(ArrayList<Rook> blackRook) {
        int index = 0;
        for (int i = 0; i < blackRook.size(); i++) {
            if (blackRook.get(i).getPositionX() == getPositionX() && blackRook.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    public int getObjectWhiteKnight(ArrayList<Knight> whiteKnight) {
        int index = 0;
        for (int i = 0; i < whiteKnight.size(); i++) {
            if (whiteKnight.get(i).getPositionX() == getPositionX() && whiteKnight.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    public int getObjectBlackKnight(ArrayList<Knight> blackKnight) {
        int index = 0;
        for (int i = 0; i < blackKnight.size(); i++) {
            if (blackKnight.get(i).getPositionX() == getPositionX() && blackKnight.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    public int getObjectWhiteBishop(ArrayList<Bishop> whiteBishop) {
        int index = 0;
        for (int i = 0; i < whiteBishop.size(); i++) {
            if (whiteBishop.get(i).getPositionX() == getPositionX() && whiteBishop.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    public int getObjectBlackBishop(ArrayList<Bishop> blackBishop) {
        int index = 0;
        for (int i = 0; i < blackBishop.size(); i++) {
            if (blackBishop.get(i).getPositionX() == getPositionX() && blackBishop.get(i).getPositionY() == getPositionY()) {
                index = i;
            }
        }
        return index;
    }

    //A method that will find the index
    public int getIndex(ArrayList<Pawn> whitePawns, ArrayList<Pawn> blackPawns, ArrayList<Knight> whiteKnights, ArrayList<Knight> blackKnights, ArrayList<Bishop> whiteBishops, ArrayList<Bishop> blackBishops, ArrayList<Rook> whiteRooks, ArrayList<Rook> blackRooks, ArrayList<Queen> blackQueen, ArrayList<Queen> whiteQueen, ArrayList<King> blackKing, ArrayList<King> whiteKing) {
        int index = 0;
        String name = getName();
        String color = getColor();
        //Pawn
        if (name.equalsIgnoreCase("Pawn") && color.equalsIgnoreCase("white")) {
            index = getObjectWhitePawn(whitePawns);
        }
        if (name.equalsIgnoreCase("Pawn") && color.equalsIgnoreCase("black")) {
            index = getObjectBlackPawn(blackPawns);
        }
        //Rook
        if (name.equalsIgnoreCase("rook") && color.equalsIgnoreCase("white")) {
            index = getObjectWhiteRook(whiteRooks);
        }
        if (name.equalsIgnoreCase("rook") && color.equalsIgnoreCase("black")) {
            index = getObjectBlackRook(blackRooks);
        }
        //Knight
        if (name.equalsIgnoreCase("Knight") && color.equalsIgnoreCase("white")) {
            index = getObjectWhiteKnight(whiteKnights);
        }
        if (name.equalsIgnoreCase("Knight") && color.equalsIgnoreCase("black")) {
            index = getObjectBlackKnight(blackKnights);
        }
        //Bishop
        if (name.equalsIgnoreCase("Bishop") && color.equalsIgnoreCase("white")) {
            index = getObjectWhiteBishop(whiteBishops);
        }
        if (name.equalsIgnoreCase("Bishop") && color.equalsIgnoreCase("black")) {
            index = getObjectBlackBishop(blackBishops);
        }
        //Queen
        if (name.equalsIgnoreCase("Queen") && color.equalsIgnoreCase("white")){
            index = 0;
        }
        if (name.equalsIgnoreCase("Queen") && color.equalsIgnoreCase("black")){
            index = 0;
        }
        //King
        if (name.equalsIgnoreCase("King") && color.equalsIgnoreCase("white")){
            index = 0;
        }
        if (name.equalsIgnoreCase("King") && color.equalsIgnoreCase("black")){
            index = 0;
        }
        return index;
    }
}