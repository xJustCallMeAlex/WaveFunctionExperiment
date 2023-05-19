package com.example.sudoku;

import java.util.ArrayList;
import java.util.List;

public class Field {
    Integer row;
    Integer column;
    Integer actualValue;
    List<Integer> possibleValues;

    public Field(Integer row, Integer column) {
        this.row = row;
        this.column = column;
        actualValue = null;
        possibleValues = new ArrayList<>();
        possibleValues.add(1);
        possibleValues.add(2);
        possibleValues.add(3);
        possibleValues.add(4);
        possibleValues.add(5);
        possibleValues.add(6);
        possibleValues.add(7);
        possibleValues.add(8);
        possibleValues.add(9);
    }

    public Integer getRow() {
        return row;
    }

    public Integer getColumn() {
        return column;
    }

    public Integer getActualValue() {
        return actualValue;
    }

    public void setActualValue(Integer actualValue) {
        this.actualValue = actualValue;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void removePossibleNumber(Integer num) {
        possibleValues.remove(num);
    }
}
