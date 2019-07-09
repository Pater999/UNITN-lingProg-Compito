/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.compito;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Auto extends HBox {
    public Auto()
    {
        Circle cerchio = new Circle(5);
        cerchio.setFill(Color.BLACK);
        this.getChildren().add(cerchio);
        this.setAlignment(Pos.CENTER);
    }
}
