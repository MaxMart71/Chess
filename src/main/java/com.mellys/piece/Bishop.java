package com.mellys.piece;

import com.mellys.Board;
import com.mellys.BoardUtils;
import com.mellys.Color;
import com.mellys.Coordinates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bishop extends LongRangePiece implements IBishop{
    public Bishop(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }


    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return getBishopMoves();
    }
}
