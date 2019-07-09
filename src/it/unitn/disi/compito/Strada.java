/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.compito;

import javafx.geometry.Pos;

public class Strada extends Terreno {
    
    boolean hasAuto = false;
    
    public Strada()
    {
        this.setStyle("-fx-background-color: grey; -fx-border-color: black");
        this.setAlignment(Pos.CENTER);
    }
    
    public void aggiungiAuto(Auto auto)
    {
        if (hasAuto != true)
        {
            this.getChildren().add(auto);
            this.hasAuto = true;
        }
    }
    
    public boolean hasAuto()
    {
        return hasAuto;
    }
}
