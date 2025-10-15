/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
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

        double roofBaseLeftX = house.getLayoutX();
        double roofBaseRightX = house.getLayoutX() + house.getWidth();
        double roofBaseY = house.getLayoutY();
        double roofPeakX = house.getLayoutX() + (house.getWidth() / 2);
        double roofPeakY = house.getLayoutY() / 2;
        Polygon roof = new Polygon(roofBaseLeftX, roofBaseY, roofBaseRightX,
                roofBaseY, roofPeakX, roofPeakY);
        roof.setFill(Color.RED);

        Rectangle lWindow = new Rectangle(door.getWidth(), door.getWidth(), Color.LIGHTBLUE);
        Rectangle rWindow = new Rectangle(door.getWidth(), door.getWidth(), Color.LIGHTBLUE);

        lWindow.setLayoutX(house.getLayoutX() + 50);
        lWindow.setLayoutY(door.getLayoutY() - (door.getHeight() / 2));

        rWindow.setLayoutX(door.getLayoutX() + door.getWidth() + 25);
        rWindow.setLayoutY(door.getLayoutY() - (door.getHeight() / 2));

        Line lGrilles1 = new Line(lWindow.getLayoutX(), lWindow.getLayoutY() + lWindow.getHeight() / 2,
                lWindow.getLayoutX() + lWindow.getWidth(), lWindow.getLayoutY() + lWindow.getHeight() / 2);
        Line lGrilles2 = new Line(lWindow.getLayoutX() + lWindow.getWidth() / 2,
                lWindow.getLayoutY(), lWindow.getLayoutX() + lWindow.getWidth() / 2,
                lWindow.getLayoutY() + lWindow.getHeight());

        Line rGrilles1 = new Line(rWindow.getLayoutX(), rWindow.getLayoutY() + rWindow.getHeight() / 2,
                rWindow.getLayoutX() + rWindow.getWidth(), rWindow.getLayoutY() + rWindow.getHeight() / 2);
        Line rGrilles2 = new Line(rWindow.getLayoutX() + rWindow.getWidth() / 2,
                rWindow.getLayoutY(), rWindow.getLayoutX() + rWindow.getWidth() / 2,
                rWindow.getLayoutY() + rWindow.getHeight());

        Rectangle chimney = new Rectangle(door.getWidth() / 2, door.getHeight() * 0.8, Color.GRAY);
        chimney.setLayoutX(door.getLayoutX() - 25);
        chimney.setLayoutY(roofPeakY + 10);

        Circle sun = new Circle(460, 60, 40);
        sun.setFill(Color.YELLOW);

        Line ray1 = new Line(440, 80, 400, 140);
        Line ray2 = new Line(440, 60, 400, 100);
        Line ray3 = new Line(460, 80, 480, 140);
        Line ray4 = new Line(450, 80, 455, 140); 

        ray1.setStrokeWidth(3);
        ray1.setStroke(Color.YELLOW);

        ray2.setStrokeWidth(3);
        ray2.setStroke(Color.YELLOW);

        ray3.setStrokeWidth(3);
        ray3.setStroke(Color.YELLOW);
        
        ray4.setStrokeWidth(3);
        ray4.setStroke(Color.YELLOW);

        Pane pane = new Pane(grass, foundation, house, door, roof, lWindow, rWindow,
                lGrilles1, lGrilles2, rGrilles1, rGrilles2, chimney, sun,
                ray1, ray2, ray3, ray4);
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        Stage stage = new Stage();
        stage.setTitle("Task 2");
        stage.setScene(scene);
        stage.show();
    }
}
