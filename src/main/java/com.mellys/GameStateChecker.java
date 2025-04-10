package com.mellys;

import com.mellys.board.Board;

public  abstract class GameStateChecker {
     public abstract GameState check(Board board, Color color);
}
