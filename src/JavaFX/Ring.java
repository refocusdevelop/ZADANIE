package JavaFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*  SEDA ON VAJA VEEL TEHA!!!!
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 *
 * VARIANT
 * import javafx.application.Application;
 import javafx.scene.Scene;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 import javafx.scene.layout.BorderPane;
 import javafx.scene.layout.StackPane;
 import javafx.scene.text.TextAlignment;
 import javafx.stage.Stage;

 /*public class MuutuvLabel extends Application{
 //Loo Label, mille sisu saab kasutaja TextFieldi kaudu muuta.
 private Label label;
 private TextField textField;
 @Override
 public void start(Stage primaryStage) throws Exception {
 Stage stage = new Stage();
 StackPane stackPane = new StackPane();
 BorderPane borderPane = new BorderPane();
 stackPane.getChildren().addAll(borderPane);
 Scene scene = new Scene(stackPane, 500, 500);
 stage.setScene(scene);

 label = new Label();
 label.setTextAlignment(TextAlignment.CENTER);
 stackPane.getChildren().addAll(label);

 textField = new TextField();
 textField.setPromptText("Sisesta siia midagi");
 textField.setOnAction(event -> {
 String tekst = textField.getText();
 label.setText(tekst);
 });
 borderPane.setBottom(textField);
 stage.show();
 }
 }
 MINU TEHTUD EILE poolik
 */


public class Ring extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            StackPane stack = new StackPane();
            Scene scene = new Scene(stack, 350, 350);
            primaryStage.setScene(scene);
            Circle ring = new Circle(50);
            stack.getChildren().add(ring);
            primaryStage.show();

        }
}
