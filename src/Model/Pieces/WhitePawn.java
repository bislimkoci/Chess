package Model.Pieces;

public class WhitePawn extends Pawn{

    public WhitePawn(int x, int y) {
        super(x, y, PieceConstants.WHITE);
    }

    @Override
    boolean availableMove(int dx, int dy) {
        return dy == 1 && dx == 0;
    }

    @Override
    boolean availableCapture(int dx, int dy) {
        return (dy == 1) && (dx == -1 || dx == 1);
    }
}
