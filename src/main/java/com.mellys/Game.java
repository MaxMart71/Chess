package com.mellys;

import com.mellys.board.Board;
import com.mellys.board.BoardConsoleRenderer;
import com.mellys.board.Move;

import java.util.List;

public class Game {
    private final Board board;
    private BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    private final List<GameStateChecker> checkers = List.of(
            new StalemateGameStateChecker(),
            new CheckmateGameStateChecker()
    );

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop() {
        Color colorToMove = Color.WHITE;

        GameState state = determingGameState(board, colorToMove);

        while (state == GameState.ONGOING) {

            renderer.render(board);

            if (colorToMove == Color.WHITE) {
                System.out.println("White to move");
            } else {
                System.out.println("Black to move");
            }

            Move move = InputCoordinates.inputMove(board, colorToMove, renderer);

            //make move
            board.makeMove(move);

            //pass move
            colorToMove = colorToMove.opposite();

            state = determingGameState(board, colorToMove);
        }
        renderer.render(board);
        System.out.println("Game ended with state = " + state);
    }

    private GameState determingGameState(Board board, Color color) {
        for (GameStateChecker checker : checkers) {
            GameState state = checker.check(board, color);

            if (state != GameState.ONGOING) {
                return state;
            }
        }
        return GameState.ONGOING;
    }
}
