package Model.Pieces;

public class Rook extends AbstractPiece{

    public Rook(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    boolean availableMove(int dx, int dy) {
        return ( dx != 0 && dy == 0) ||
                (dy != 0 && dx == 0);
    }

    @Override
    boolean availableCapture(int dx, int dy) {
        return availableMove(dx, dy);
    }
}
