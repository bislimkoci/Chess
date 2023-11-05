package Model.Pieces;

public class King extends AbstractPiece{

    public King(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    boolean availableMove(int dx, int dy) {
        return (Math.abs(dx) == 0 && Math.abs(dy) == 1)  ||
                (Math.abs(dx) == 1 && Math.abs(dy) == 0) ||
                (Math.abs(dx) == 1 && Math.abs(dy) == 1);
    }

    @Override
    boolean availableCapture(int dx, int dy) {
        return availableMove(dx, dy);
    }
}
