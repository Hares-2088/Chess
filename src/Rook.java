import java.util.ArrayList;

public class Rook extends Chessman{
    public Rook(int positionX, int positionY, boolean alive, String color, String name) {
        super(positionX, positionY, alive, color,name);
    }
    public Rook(){}

    public void createWhiteRooks(ArrayList<Rook> rook) {
        Rook WR1 = new Rook(0, 7, true, "white", "WR1");
        rook.add(WR1);
        Rook WR2 = new Rook(7, 7, true, "black", "WR2");
        rook.add(WR2);
    }

    public void createBlackRooks(ArrayList<Rook> rook) {
        Rook BR1 = new Rook(0, 0, true, "black", "BR1");
        rook.add(BR1);
        Rook BR2 = new Rook(7, 0, true, "black", "BR2");
        rook.add(BR2);
    }
}
