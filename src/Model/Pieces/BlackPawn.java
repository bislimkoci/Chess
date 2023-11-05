package Model.Pieces;

public class BlackPawn extends Pawn{

    public BlackPawn(int x, int y) {
        super(x, y, PieceConstants.BLACK);
    }

    @Override
    boolean availableMove(int dx, int dy) {
        return dy == -1 && dx == 0;
    }

    @Override
    boolean availableCapture(int dx, int dy) {
        return dy == -1 && (dx == 1|| dx == -1);
    }
}
