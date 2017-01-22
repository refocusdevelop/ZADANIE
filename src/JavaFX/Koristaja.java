package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.ArrayList;

/** TEHTUD!
 * Created by kullirist on 21/01/2017.
 *
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application{
        @Override
        public void start(Stage primaryStage) throws Exception {

            primaryStage.show();

            StackPane kujund = new StackPane();
            Scene stseen = new Scene(kujund, 500, 500);
            primaryStage.setScene(stseen);

            Label l = new Label("Keegi on su selja taga!");

            l.setTranslateX(150);
            l.setTranslateY(200);
            l.setScaleX(0.5);
            l.setScaleY(2);
            l.setRotate(10);
            kujund.getChildren().add(l);

            ArrayList<Circle> list = new ArrayList<>();   //ringide moodustamine
            for (int i = 0; i < 200; i++) {
                Circle joonistanRingi = new Circle(Math.random() * 100);
                joonistanRingi.setTranslateX(Math.random()*500);
                joonistanRingi.setTranslateY(Math.random()*500);
                joonistanRingi.setOnMouseEntered(event -> {
                    joonistanRingi.setVisible(false);
                });
                kujund.getChildren().add(joonistanRingi);
                list.add( joonistanRingi);
            }
            System.out.println("Keegi on su selja taga!");
        }
}
