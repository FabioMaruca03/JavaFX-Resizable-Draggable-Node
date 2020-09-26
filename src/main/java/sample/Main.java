package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Drag Resize Demo");
        Pane root = new Pane();

        //-----| SETTINGS |-----//
        ResizablePane p = new ResizablePane(100, 100);
        p.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        p.setPrefWidth(200);
        p.setPrefHeight(200);

        //-----| IMAGE VIEW EXAMPLE |-----//
//        ImageView v = new ImageView(new Image("prova.jpg", 100, 100, false, false));
//        v.setFitHeight(50);
//        v.setFitWidth(50);
//        p.getChildren().add(v);
//
//        //-----| RECTANGLE EXAMPLE |-----//
//        p.getChildren().add(new Rectangle(50, 50, Color.AQUA));

        //-----| TEXT EXAMPLE |-----//
        Text t = new Text("Test");
        t.setX(50);
        t.setY(50);
        t.setFont(new Font(10));
        StackPane c = new StackPane(t);
        c.setAlignment(Pos.CENTER);
        p.getChildren().add(c);

        //-----| ENDING OPERATIONS |-----//
        DragResizeMod.makeResizable(p);
        root.getChildren().addAll(p);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
