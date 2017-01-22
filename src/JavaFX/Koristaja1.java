package JavaFX;

import com.sun.javafx.tk.FontLoader;
import com.sun.javafx.tk.Toolkit;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.ArrayList;

/** TEHTUD!
 * Created by kullirist on 21/01/2017.
 * ÜLESSANDE PÜSTITUS
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja1 extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("The Stage Version of Ky Tree Program");
        primaryStage.show();

        StackPane kujund = new StackPane();
        Scene stseen = new Scene(kujund, 500, 500);
        primaryStage.setScene(stseen);
        kujund.setRotate(30);     //why not, for fun!!!
        stseen.setFill(Paint.valueOf("#ff9900"));                //taustavärv

        Label l = new Label();
        l.setText("Laiskvorst!");
        //FontLoader fontLoader = Toolkit.getToolkit().getFontLoader(); // http://stackoverflow.com/questions/21074024/how-to-get-label-getwidth-in-javafx
        l.setFont(Font.font("Ubuntu Bold", FontWeight.BOLD, 50));l.setTranslateX(150);

        l.setTranslateY(100);
        l.setScaleX(0.5);
        l.setScaleY(2);
        l.setRotate(10);
        kujund.getChildren().add(l);

        ArrayList<Circle> list = new ArrayList<>();

        for (int i = 0; i < 300; i++) {             //siin on ringide arv
            Circle joonistanRingi = new Circle(Math.random() * 70);
            joonistanRingi.setTranslateX(Math.random()*500-250);
            joonistanRingi.setTranslateY(Math.random()*500-250);   //asukoht xy telje suhtes
            joonistanRingi.setOnMouseEntered(event -> {
                joonistanRingi.setVisible(false);
            });
            kujund.getChildren().add(joonistanRingi);
            list.add( joonistanRingi);
        }
    }
    // SEE ON MU ESIMENE KATSE.
    // SEE SOBIB MÄNGUKS KUI ON VAJA TEHA 'konkreetne täpne arv' RINGE
        /*Circle joonistanRingi = new Circle(30);
        Circle joonistanRingi2 = new Circle(360);
        Circle joonistanRingi3 = new Circle(60);
        Circle joonistanRingi4 = new Circle(110);
        Circle joonistanRingi5 = new Circle(10);
        Circle joonistanRingi6 = new Circle(0);
        Circle joonistanRingi7 = new Circle(40);
        joonistanRingi2.setTranslateX(70);              //liigutab
        joonistanRingi3.setTranslateX(60);
        joonistanRingi4.setTranslateX(10);
        joonistanRingi5.setTranslateX(0);
        joonistanRingi6.setTranslateX(100);
        joonistanRingi7.setTranslateX(90);
        */
    //kujund.getChildren().addAll(l, joonistanRingi, joonistanRingi2, joonistanRingi3, etc....);
}
