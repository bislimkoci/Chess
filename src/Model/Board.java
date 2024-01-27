package Model;

import Model.Pieces.Piece;



public interface Board {


    public void playerMakeMove(Player player, Piece piece, int x, int y);


    //Checks if player is mating the other player.
    public boolean mate(Player player);
}
