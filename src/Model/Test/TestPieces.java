package Model.Test;

import Model.Pieces.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestPieces {

    @Test
    void whitePawnTest() {
        WhitePawn whitePawn = new WhitePawn(1, 1);
        whitePawn.move(0,1);
        assertEquals(1, whitePawn.getX());
        assertEquals(2, whitePawn.getY());
        whitePawn.move(0, 2);
        assertEquals(1, whitePawn.getX());
        assertEquals(2, whitePawn.getY());
        BlackPawn bp = new BlackPawn(2, 3);
        whitePawn.capture(bp);
        assertEquals(2, whitePawn.getX());
        assertEquals(3, whitePawn.getY());
        BlackPawn bp_1 = new BlackPawn(5, 5);
        try {
            whitePawn.capture(bp_1);
        } catch (Exception e) {
            assertEquals(2, whitePawn.getX());
            assertEquals(3, whitePawn.getY());
        }
    }

    @Test
    void blackPawnTest() {
        BlackPawn blackPawn = new BlackPawn(7, 7);
        blackPawn.move(0,-1);
        assertEquals(7, blackPawn.getX());
        assertEquals(6, blackPawn.getY());
        blackPawn.move(0, 2);
        assertEquals(7, blackPawn.getX());
        assertEquals(6, blackPawn.getY());
        WhitePawn wp = new WhitePawn(6, 5);
        blackPawn.capture(wp);
        assertEquals(6, blackPawn.getX());
        assertEquals(5, blackPawn.getY());
        WhitePawn wp_1 = new WhitePawn(1, 1);
        try {
            blackPawn.capture(wp_1);
        } catch (Exception e) {
            assertEquals(6, blackPawn.getX());
            assertEquals(5, blackPawn.getY());
        }
    }

    @Test
    void knightTest() {
        Knight knight = new Knight(4,4, PieceConstants.WHITE);
        knight.move(-1, 2);
        assertEquals(3, knight.getX());
        assertEquals(6, knight.getY());
        Piece pawn = new BlackPawn(4, 4);
        knight.capture(pawn);
        assertEquals(4, knight.getX());
        assertEquals(4, knight.getY());
        Piece pawn2 = new BlackPawn(1, 1);
        try {
            knight.capture(pawn2);
        } catch (Exception e) {
            assertEquals(4, knight.getX());
            assertEquals(4, knight.getY());
        }

    }

    @Test
    void bishopTest() {
        Bishop bishop = new Bishop(4,4, PieceConstants.WHITE);
        bishop.move(-2, 2);
        assertEquals(2, bishop.getX());
        assertEquals(6, bishop.getY());
        Piece pawn = new BlackPawn(4, 4);
        bishop.capture(pawn);
        assertEquals(4, bishop.getX());
        assertEquals(4, bishop.getY());
        Piece pawn2 = new BlackPawn(3, 1);
        try {
            bishop.capture(pawn2);
        } catch (Exception e) {
            assertEquals(4, bishop.getX());
            assertEquals(4, bishop.getY());
        }
    }

    @Test
    void rookTest() {
        Rook rook = new Rook(4,4, PieceConstants.WHITE);
        rook.move(3, 0);
        assertEquals(7, rook.getX());
        assertEquals(4, rook.getY());
        rook.move(3, 0);
        assertEquals(7, rook.getX());
        assertEquals(4, rook.getY());
        Piece pawn = new BlackPawn(7, 0);
        rook.capture(pawn);
        assertEquals(7, rook.getX());
        assertEquals(0, rook.getY());
        Piece pawn2 = new BlackPawn(7, 7);
        try {
            rook.capture(pawn2);
        } catch (Exception e) {
            assertEquals(7, rook.getX());
            assertEquals(0, rook.getY());
        }
    }


    @Test
    void kingTest() {
        King king = new King(4,4, PieceConstants.WHITE);
        king.move(1, -1);
        assertEquals(5, king.getX());
        assertEquals(3, king.getY());
        king.move(0, 0);
        assertEquals(5, king.getX());
        assertEquals(3, king.getY());
        Piece pawn = new BlackPawn(5, 4);
        king.capture(pawn);
        assertEquals(5, king.getX());
        assertEquals(4, king.getY());
        Piece pawn2 = new BlackPawn(7, 7);
        try {
            king.capture(pawn2);
        } catch (Exception e) {
            assertEquals(5, king.getX());
            assertEquals(4, king.getY());
        }
    }


}
