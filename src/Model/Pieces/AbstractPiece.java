package Model.Pieces;

abstract class AbstractPiece implements Piece {

    protected int x,y;
    protected boolean color;


    public AbstractPiece(int x, int y, boolean color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    abstract boolean availableMove(int dx, int dy);

    public boolean isInside(int dx, int dy) {
        return x + dx < 8 && y + dy < 8 && x > -1 && y > -1;
    }

    @Override
    public void move(int dx, int dy) {
        if (availableMove(dx, dy) && isInside(dx, dy)) {
            this.x += dx;
            this.y += dy;
        }
    }

    abstract boolean availableCapture(int dx, int dy);

    @Override
    public void capture(Piece other) {
        int otherX = ((AbstractPiece)other).x;
        int otherY = ((AbstractPiece)other).y;
        if (availableCapture(otherX -x, otherY -y)) {
            x = otherX;
            y = otherY;
        } else {
            throw new IllegalArgumentException("Piece can't Capture");
        }
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
