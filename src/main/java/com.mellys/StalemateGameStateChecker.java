package com.mellys;

import com.mellys.board.Board;
import com.mellys.piece.Piece;

import java.util.List;
import java.util.Set;

public class StalemateGameStateChecker extends GameStateChecker{
    @Override
    public GameState check(Board board, Color color) {
        List<Piece> pieces = board.getPiecesByColor(color);

        for (Piece piece : pieces) {
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            if (!availableMoveSquares.isEmpty()){
                return GameState.ONGOING;
            }
        }

        return GameState.STALEMATE;

    }
}
