package com.mellys.board;

import com.mellys.Coordinates;

public class Move {
    public final Coordinates from, to;

    public Move(Coordinates from, Coordinates coordinates) {
        this.from = from;
        to = coordinates;
    }
}
