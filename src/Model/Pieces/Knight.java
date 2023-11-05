package Model.Pieces;

public class Knight extends AbstractPiece {
    public Knight(int x, int y, boolean color) {
        super(x, y, color);
    }

    @Override
    boolean availableMove(int dx, int dy) {
        return (Math.abs(dx) == 1 && Math.abs(dy) == 2)  ||
                (Math.abs(dx) == 2 && Math.abs(dy) == 1);
    }

    @Override
    boolean availableCapture(int dx, int dy) {
        return availableMove(dx, dy);
    }
}
