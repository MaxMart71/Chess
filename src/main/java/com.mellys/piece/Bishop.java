package com.mellys.piece;

import com.mellys.Board;
import com.mellys.BoardUtils;
import com.mellys.Color;
import com.mellys.Coordinates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bishop extends Piece {
    public Bishop(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }


    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        Set<CoordinatesShift> result = new HashSet<>();
        for (int i = -7; i <= 7; i++) {

            if (i == 0) continue;

            result.add(new CoordinatesShift(i, i));

        }

        for (int i = -7; i <= 7; i++) {

            if (i == 0) continue;

            result.add(new CoordinatesShift(i, -i));

        }

        return result;
    }

    @Override
    protected boolean isSquareAvailableForMove(Coordinates coordinates, Board board) {
        boolean result = super.isSquareAvailableForMove(coordinates, board);

        if (result) {
            List<Coordinates> coordinatesBetween = BoardUtils.getDiagonalCoordinatesBetween(this.coordinates, coordinates);

            for (Coordinates c : coordinatesBetween) {
                if (!board.isSquareEmpty(c)) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}
