package Model;

import Model.Pieces.Piece;

import java.util.Scanner;

public class TwoPlayerChessGame implements Game {

    private Board board;
    private Player player1, player2;
    private boolean gameRunning;
    private boolean whiteTurn;

    public TwoPlayerChessGame(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        gameRunning = true;
        whiteTurn = true;
    }

    @Override
    public void run() {
        message("White begins:");
        gameLoop();
    }

    public void gameLoop() {
        while (gameRunning) {
            if (whiteTurn) {
                playerTurn(player1);
            } else {
                playerTurn(player2);
            }
        }
    }

    private void playerTurn(Player player) {
        checkMate(player);
        if (!gameRunning) {
            return;
        }
        makePlayerMove(player);
    }


    private void checkMate(Player player) {
        if (board.mate(player)) {
            gameRunning = false;
            message(player.toString() + "won!");
        }
    }

    private void makePlayerMove(Player player){
        takePlayerInput(player);
    }

    private void takePlayerInput(Player player){
        Scanner scanner = new Scanner(System.in);
        message("What piece do you wish to move?");
        String piece = scanner.nextLine();
        message("Where do you wish to move?");
        String place = scanner.nextLine();
    }

    private void message(String message) {
        System.out.println(message);
    }

}
