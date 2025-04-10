package com.mellys;

import com.mellys.board.Board;

public class Main {
    public static void main(String[] args) {
        //paste here fen ex:"rnbqkbnc/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"
        Board board = new Board("rnbqkbnc/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        Game game = new Game(board);
        game.gameLoop();
    }
}
