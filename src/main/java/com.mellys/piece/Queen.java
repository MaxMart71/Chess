package com.mellys.piece;

import com.mellys.Color;
import com.mellys.Coordinates;

import java.util.Set;

public class Queen extends LongRangePiece implements IBishop, IRook{
    public Queen(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        Set<CoordinatesShift> moves = getBishopMoves();
        moves.addAll(getRookMoves());

        return moves;
    }
}
