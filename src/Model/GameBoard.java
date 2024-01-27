package Model;

import Model.Pieces.Piece;

public class GameBoard implements Board {

    private Player pl1, pl2;

    public GameBoard(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }


    @Override
    public void playerMakeMove(Player player, Piece pice, int x, int y) {

    }

    @Override
    public boolean mate(Player player) {
        return false;
    }
}
