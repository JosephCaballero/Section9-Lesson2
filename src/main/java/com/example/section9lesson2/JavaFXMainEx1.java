package com.example.section9lesson2;
import javafx.scene.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXMainEx1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        //remove code from here
        Image image;
        String imagePath ="https://th.bing.com/th/id/OIP.EyehxXh78OrV5PPBp3Qj4gHaEA?w=306&h=180&c=7&r=0&o=5&dpr=1.25&pid=1.7";
        image = new Image(getClass().getResource(imagePath).toString);

        Rectangle rect = new Rectangle(10,12,12,12);
        Polygon poly = new Polygon(10,10,10);
        Button btn = new Button();
        btn.setText("Say 'HelloWorld'");
        Color color = Color.rgb(255,0,0,1.0);
        btn.setStyle("-fx-background-color: #ff0000; ");
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane group = new StackPane();
        group.getChildren().add(btn);
       // group.getChildren().add(rect);
        group.getChildren().add(poly);

        Scene scene = new Scene(group, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        //to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
