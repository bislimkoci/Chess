package Model.Pieces;

public interface Piece {
    public void move(int dx, int dy);

    public void capture(Piece other);


}
