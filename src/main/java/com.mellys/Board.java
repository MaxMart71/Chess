package com.mellys;

import piece.Pawn;
import piece.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPiece(Coordinates coordinates, Piece piece){
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }

    public void setupDefaultPiecesPositions(){
        for (File file: File.values()){
            setPiece(new Coordinates(file, 2), new Pawn(Color.WHITE, new Coordinates(file,2)));
            setPiece(new Coordinates(file, 7), new Pawn(Color.BLACK, new Coordinates(file,7)));
        }

    }

    public static boolean isSquareDark(Coordinates coordinates){
        return (((coordinates.file.ordinal() + 1) + coordinates.rank) % 2) == 0;
    }

    public boolean isSquareEmpty(Coordinates coordinates){
        return !pieces.containsKey(coordinates);
    }

    public Piece getPieceByCoordinates(Coordinates coordinates){
        return pieces.get(coordinates);
    }
}
