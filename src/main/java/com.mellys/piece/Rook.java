package com.mellys.piece;

import com.mellys.Color;
import com.mellys.Coordinates;

import java.util.Set;

public class Rook extends LongRangePiece implements IRook{
    public Rook(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }



    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return getRookMoves();
    }

}
