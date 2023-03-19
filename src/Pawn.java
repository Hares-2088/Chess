import java.util.ArrayList;

public class Pawn extends Chessman{
    public Pawn(int positionX, int positionY, boolean alive, String color, String name) {
        super(positionX, positionY, alive, color, name);
    }
    public Pawn(){}

    @Override
    public void move(int x, int y) {
        setPositionX(x);
        setPositionY(y);
    }
    public void createWhitePawns(Board board, ArrayList<Pawn> pawns) {
        for (int i = 0; i < board.getBoardPositions().length; i++) {
            int nameNum = i+1;
            String name = "WP" + nameNum;
            pawns.add(new Pawn(i, 6, true, "white", name));
        }
    }

    public void createBlackPawns(Board board, ArrayList<Pawn> pawns) {
        for (int i = 0; i < board.getBoardPositions().length; i++) {
            int nameNum = i+1;
            String name = "BP" + nameNum;
            pawns.add(new Pawn(i, 1, true, "black", name));
        }
    }
}
