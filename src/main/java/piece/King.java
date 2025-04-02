package piece;

import com.mellys.Color;
import com.mellys.Coordinates;
import piece.Piece;

import java.util.Set;

public class King extends Piece {
    public King(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return null;
    }
}
