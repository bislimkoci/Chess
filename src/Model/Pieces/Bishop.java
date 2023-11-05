package Model.Pieces;

public class Bishop extends AbstractPiece{

    public Bishop(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    boolean availableMove(int dx, int dy) {
        return dx != 0 && dy != 0 && Math.abs(dx) == Math.abs(dy);
    }

    @Override
    boolean availableCapture(int dx, int dy) {
        return availableMove(dx, dy);
    }
}
