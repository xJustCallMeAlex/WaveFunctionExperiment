package com.example.sudoku;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SudokuController implements Initializable {

    @FXML
    private GridPane gameGrid;

    private List<GridPane> innerGridPanes;
    private LogicHandler gameLogic;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gameLogic = new LogicHandler();
        innerGridPanes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                GridPane pane = new GridPane();
                pane.setGridLinesVisible(true);
                pane.setStyle("-fx-border-color: black; -fx-border-width: 1");


                for (int a = 0; a < 3; a++) {
                    for (int b = 0; b < 3; b++) {
                        GridPane innerPane = new GridPane();
                        Label l1 = new Label("1");
                        l1.setPrefWidth(20.0);
                        l1.setAlignment(Pos.CENTER);
                        innerPane.add(l1,0,0);
                        Label l2 = new Label("2");
                        l2.setPrefWidth(20.0);
                        l2.setAlignment(Pos.CENTER);
                        innerPane.add(l2,1,0);
                        Label l3 = new Label("3");
                        l3.setPrefWidth(20.0);
                        l3.setAlignment(Pos.CENTER);
                        innerPane.add(l3,2,0);
                        Label l4 = new Label("4");
                        l4.setPrefWidth(20.0);
                        l4.setAlignment(Pos.CENTER);
                        innerPane.add(l4,0,1);
                        Label l5 = new Label("5");
                        l5.setPrefWidth(20.0);
                        l5.setAlignment(Pos.CENTER);
                        innerPane.add(l5,1,1);
                        Label l6 = new Label("6");
                        l6.setPrefWidth(20.0);
                        l6.setAlignment(Pos.CENTER);
                        innerPane.add(l6,2,1);
                        Label l7 = new Label("7");
                        l7.setPrefWidth(20.0);
                        l7.setAlignment(Pos.CENTER);
                        innerPane.add(l7,0,2);
                        Label l8 = new Label("8");
                        l8.setPrefWidth(20.0);
                        l8.setAlignment(Pos.CENTER);
                        innerPane.add(l8,1,2);
                        Label l9 = new Label("9");
                        l9.setPrefWidth(20.0);
                        l9.setAlignment(Pos.CENTER);
                        innerPane.add(l9,2,2);
                        pane.add(innerPane, a, b);
                    }
                }


                innerGridPanes.add(pane);
                gameGrid.add(pane, i, j);
            }
        }

    }
}
