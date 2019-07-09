/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unitn.disi.compito;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Compito extends Application {
    
    Stage mainWindow = null;
    TextField tfContatoreAuto;
    MyButton btnAggiungiAuto;
    GridPane griglia;
    boolean aggiungiAutoClicked = false; //VARIABILE PER SAPERE SE IL BOTTONE è stato cliccato o no
    
    BorderPane prepareSceneContent()
    {
        BorderPane root = new BorderPane();
        griglia = new GridPane();
        VBox menu = new VBox();
        Label lblContatoreAuto = new Label("Auto Disponibili");
        btnAggiungiAuto = new MyButton("Aggiungi Auto", false, new ListenerAggiungiAuto());
        MyButton btnInizia = new MyButton("Inizia", false, new ListenerInizia());
        tfContatoreAuto = new TextField("3");
        tfContatoreAuto.setDisable(true);
        tfContatoreAuto.setMinSize(200,50);
        menu.getChildren().addAll(lblContatoreAuto, tfContatoreAuto, btnAggiungiAuto, btnInizia);
        menu.setAlignment(Pos.CENTER);
        menu.setSpacing(20);
        menu.setPadding(new Insets(0,10,0,0));
        root.setRight(menu);
        
        Terreno[] grigliaTerreno = new Terreno[64];
        int u = 0;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (i == 0 || j == 0 || i == 7 || j == 7)
                {
                    grigliaTerreno[u] = new Strada();
                }
                else
                {
                    grigliaTerreno[u] = new Prato();
                }
                grigliaTerreno[u].addEventHandler(MouseEvent.MOUSE_CLICKED, new ListenerGriglia());
                griglia.add(grigliaTerreno[u], i, j);
            }
        }
        
        griglia.setAlignment(Pos.CENTER);
        
        root.setCenter(griglia);
        
        return root;
    }
    
    class MyButton extends Button
    {
        MyButton(String label, boolean isDisabled, EventHandler listener)
        {
            super(label);
            setMinSize(200,50);
            setDisable(isDisabled);
            addEventHandler(ActionEvent.ACTION, listener);
        }
    }
    
    class ListenerInizia implements EventHandler
    {
        public void handle(Event t)
        {
            
        }
    }
    
    class ListenerAggiungiAuto implements EventHandler
    {
        public void handle(Event t)
        {
            aggiungiAutoClicked = true;
        }
    }
    
    class ListenerGriglia implements EventHandler
    {
        public void handle(Event t)
        {
            Terreno tmp = (Terreno)t.getSource();
            int x = GridPane.getColumnIndex(tmp);
            int y = GridPane.getRowIndex(tmp);
            if (tmp instanceof Strada)
            {
               System.out.print("STRADA\n");
               if(aggiungiAutoClicked)
               {
                   int numero = Integer.parseInt(tfContatoreAuto.getText());
                   if (numero > 1)
                   {
                       numero--;
                       tfContatoreAuto.setText(Integer.toString(numero));
                   }
                   else
                   {
                       tfContatoreAuto.setText("0");
                       btnAggiungiAuto.setDisable(true);
                   }
                   
                   ((Strada) tmp).aggiungiAuto(new Auto());
                   aggiungiAutoClicked = false;
               }
               else
               {
                   if (((Strada) tmp).hasAuto() == false)
                   {
                        griglia.getChildren().remove(tmp);
                        tmp = new Prato();
                        tmp.addEventHandler(MouseEvent.MOUSE_CLICKED, new ListenerGriglia());
                        griglia.add(tmp,x,y); 
                   }
               } 
            } else if (tmp instanceof Prato)
            {
                System.out.print("Prato\n");
               griglia.getChildren().remove(tmp);
               tmp = new Strada();
               tmp.addEventHandler(MouseEvent.MOUSE_CLICKED, new ListenerGriglia());
               griglia.add(tmp,x,y);
            }
        }
    }
    
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(this.prepareSceneContent(),800,1000);
        mainWindow = primaryStage;
        primaryStage.setTitle("Compito");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
