package com.mellys;

import java.util.Scanner;

public class InputCoordinates {
    Scanner scanner = new Scanner(System.in);
    public Coordinates input(){
        while (true){
            System.out.println("Please enter coordinates (ex, a1)");
            String line = scanner.nextLine();

            if (line.length() != 2){
                System.out.println("Invalid format");
                continue;
            }
        }
    }
}
