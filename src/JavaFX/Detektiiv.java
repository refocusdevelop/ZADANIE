package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * tehtud by Dmitry Lukas, Juri Ahhundov, siis Kristit Tammet lahendus
 *
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 *
 * siin on vastupidi, ALGUSES NÄHA ja SIIS KAOB, setVisible(true); ja circle1.setVisible(false);
 */

public class Detektiiv extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception{

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        Random random = new Random();

        Circle circle1  = new Circle(50);
        circle1.setCenterX(random.nextInt(500-250));
        circle1.setCenterY(random.nextInt(500-250));
        circle1.setVisible(true);
        circle1.setFill(Paint.valueOf("#0000FF"));


        Circle circle2  = new Circle(50);
        circle2.setCenterX(random.nextInt(500+30));
        circle2.setCenterY(random.nextInt(500+30));
        circle2.setVisible(true);
        circle2.setFill(Paint.valueOf("#008080"));


        Circle circle3  = new Circle(50);
        circle3.setCenterX(random.nextInt(500+30));
        circle3.setCenterY(random.nextInt(500+30));
        circle3.setVisible(true);
        circle3.setFill(Paint.valueOf("#00BFFF"));

        circle1.setOnMouseEntered(event -> {
            circle1.setVisible(false);
        });

        circle2.setOnMouseEntered(event->{
            circle2.setVisible(false);
        });

        circle3.setOnMouseEntered(event->{
            circle3.setVisible(false);
        });

        pane.getChildren().addAll(circle1, circle2, circle3);

    }
}