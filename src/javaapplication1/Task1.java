/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;

/**
 *
 * @author 6289632
 */
public class Task1 {

    public void task1() {
        // Constants for the scene size 
        final double SCENE_WIDTH = 520.0;
        final double SCENE_HEIGHT = 520.0;

        // Constants for each square's XY coordinates 
        final int X1 = 10, Y1 = 10; // Square #1 
        final int X2 = 60, Y2 = 60; // Square #1 
        final int X3 = 110, Y3 = 110; // Square #3 

        // Constants for each square's width and height 
        final int WIDTH1 = 500, HEIGHT1 = 500; // Square #1 
        final int WIDTH2 = 400, HEIGHT2 = 400; // Square #2 
        final int WIDTH3 = 300, HEIGHT3 = 300; // Square #3 

        // Constants for the circle's geometry 
        final int CENTER_X = 260, CENTER_Y = 260, RADIUS
                = 150; 
        // Create square #1 here. Set its stroke color to black 
        // and set its fill color to null. 
        Rectangle s1 = new Rectangle(X1, Y1, WIDTH1, HEIGHT1);
        Rectangle s2 = new Rectangle(X2, Y2, WIDTH2, HEIGHT2);
        Rectangle s3 = new Rectangle(X3, Y3, WIDTH3, HEIGHT3);
        
        s1.setStroke(Color.BLACK);
        s2.setStroke(Color.BLACK);
        s3.setStroke(Color.BLACK);
        
        s1.setFill(null);
        s2.setFill(null);
        s3.setFill(null);
        
        Line l1 = new Line(X1, Y1, X3, Y3);
        Line l2 = new Line(X3 + WIDTH3, Y3, X1 + WIDTH1, Y1);
        Line l3 = new Line(X3, Y3 + HEIGHT3, X1 , Y1 + HEIGHT1);
        Line l4 = new Line(X1 + WIDTH1, Y1 + HEIGHT1, X3 + WIDTH3, Y3 + HEIGHT3);
        
        Circle circle = new Circle();
        circle.setCenterX(SCENE_WIDTH/2);
        circle.setCenterY(SCENE_HEIGHT/2);
        circle.setRadius(WIDTH3/2);
        circle.setFill(Color.BLACK);
        
        
        Pane pane = new Pane(s1, s2, s3, l1, l2, l3, l4, circle);
        Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
        
        Stage stage = new Stage();
        stage.setTitle("Task 1");
        stage.setScene(scene);
        stage.show();
    }
}
