package com.mellys;

import com.mellys.piece.Piece;

import java.util.Scanner;
import java.util.Set;

public class InputCoordinates {
    public static final Scanner scanner = new Scanner(System.in);
    public static Coordinates input(){
        while (true){
            System.out.println("Please enter coordinates (ex, a1)");
            String line = scanner.nextLine();

            if (line.length() != 2){
                System.out.println("Invalid format");
                continue;
            }

            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            if (Character.isLetter(fileChar)){
                System.out.println("Ivalid format");
                continue;
            }

            if (Character.isDigit(rankChar)){
                System.out.println("Ivalid format");
                continue;
            }

            int rank = Character.getNumericValue(rankChar);
            if (rank < 1 || rank > 8){
                System.out.println("Invalid format");
                continue;
            }

            File file = File.fromChar(fileChar);
            if (file == null){
                System.out.println("Invalid format");
                continue;
            }

            return new Coordinates(file, rank);
        }

    }
    public static Coordinates inputPieceCoordinatesForColor(Color color, Board board){

        while (true){
            System.out.println("Enter coordinates for piece to move");
            Coordinates coordinates = input();

            if (board.isSquareEmpty(coordinates)){
                System.out.println("Empty square");
            }

            Piece piece = board.getPiece(coordinates);
            if (piece.color != color){
                System.out.println("Wrong color");
                continue;
            }

            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);
            if (availableMoveSquares.isEmpty()){
                System.out.println("Blocked piece");
                continue;
            }

            return coordinates;
        }
    }

    public static Coordinates inputAvailableSquare(Set<Coordinates> coordinates){
        while (true){
            System.out.println("Please enter your move for a selected piece");
            Coordinates input = input();

            if (!coordinates.contains(input)){
                System.out.println("Non-available square");
                continue;
            }

            return input;
        }
    }
}
