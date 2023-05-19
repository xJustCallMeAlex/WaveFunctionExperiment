package com.example.sudoku;

import java.util.ArrayList;
import java.util.List;

public class LogicHandler {
    private final List<Field> gameBoard;

    public LogicHandler() {
        gameBoard = new ArrayList<>();
        gameBoard.add(new Field(0,0));
        gameBoard.add(new Field(0,1));
        gameBoard.add(new Field(0,2));
        gameBoard.add(new Field(1,0));
        gameBoard.add(new Field(1,1));
        gameBoard.add(new Field(1,2));
        gameBoard.add(new Field(2,0));
        gameBoard.add(new Field(2,1));
        gameBoard.add(new Field(2,2));
    }
}
