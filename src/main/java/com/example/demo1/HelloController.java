package com.example.demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public Label label;

    @FXML
    public ComboBox<String> comboBox;

    ObservableList<String> list = FXCollections.observableArrayList("Java", "C+");


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(list);
    }

    public void comboBoxChange(ActionEvent event) {
        label.setText(comboBox.getValue());
    }
}