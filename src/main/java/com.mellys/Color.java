package com.mellys;

public enum Color {
    WHITE,
    BLACK;

    public Color opposite(){
        return this == WHITE ? BLACK : WHITE;
    }
}
