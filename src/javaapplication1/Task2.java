/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author 6289632
 */
public class Task2 {
    public void task2() {
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;
        
        Rectangle grass = new Rectangle(SCENE_WIDTH, SCENE_HEIGHT / 8, Color.GREEN);
        grass.setLayoutY(SCENE_HEIGHT - (SCENE_HEIGHT / 8));
        
        Rectangle foundation = new Rectangle(SCENE_WIDTH / 2, grass.getHeight() / 4, Color.BEIGE);
        foundation.setLayoutX(SCENE_WIDTH / 4);
        foundation.setLayoutY(grass.getLayoutY());
        
        Rectangle house = new Rectangle(foundation.getWidth(), grass.getHeight() * 3, Color.LIGHTGREY);
        house.setLayoutX(foundation.getLayoutX());
        house.setLayoutY(foundation.getLayoutY() - (grass.getHeight() * 3));
        house.setStroke(Color.BLACK);
        
        Rectangle door = new Rectangle(foundation.getWidth() / 6, house.getHeight() / 2, Color.BROWN);
        door.setLayoutX(house.getLayoutX() + (house.getWidth() / 2));
        door.setLayoutY(house.getLayoutY() + (house.getHeight() / 2));
        //door.setLayoutY();
        
        Pane pane = new Pane(grass, foundation, house, door);
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        Stage stage = new Stage();
        stage.setTitle("Task 2");
        stage.setScene(scene);
        stage.show();
        
    }
    
}
