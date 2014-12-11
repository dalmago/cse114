
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class GUI extends Application{	
	private Label text1 = new Label("text1");
	private Label text2 = new Label("text2");
	private Label text3 = new Label("text3");
	private Label text4 = new Label("text4");
	
	private Button button1 = new Button("button1");
	private Button button2 = new Button("button2");
	private Button button3 = new Button("button3");
	private Button button4 = new Button("button4");
	private Button button5 = new Button("button5");
	
	private ImageView image = new ImageView("http://mini.physics.sunysb.edu/~marivi/img/sbu-vert.jpg");
	
	public void start (Stage primaryStage){

		GridPane gridPane = new GridPane();
		gridPane.setHgap(2);
		gridPane.setVgap(2);
		
		VBox pane1 = new VBox(4);
		pane1.getChildren().add(text1);
		pane1.getChildren().add(text2);
		pane1.getChildren().add(text3);
		pane1.getChildren().add(text4);
		
		gridPane.add(pane1, 0, 0);
		
		FlowPane pane2 = new FlowPane();
		pane2.getChildren().add(button1);
		pane2.getChildren().add(button2);
		pane2.getChildren().add(button3);
		pane2.getChildren().add(button4);
		pane2.getChildren().add(button5);
		
		gridPane.add(pane2, 1, 0);
		
		Pane pane3 = new Pane();
		pane3.getChildren().add(image);
		
		gridPane.add(pane3, 0, 1);
		
		GridPane pane4 = new GridPane();
		pane4.setHgap(2);
		pane4.setVgap(2);
		Rectangle r1 = new Rectangle(25, 10, 60, 30);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.BLACK);
		Rectangle r2 = new Rectangle(25, 10, 60, 30);
		r2.setStroke(Color.WHITE);
		r2.setFill(Color.WHITE);
		Rectangle r3 = new Rectangle(25, 10, 60, 30);
		r3.setStroke(Color.BLACK);
		r3.setFill(Color.BLACK);
		Rectangle r4 = new Rectangle(25, 10, 60, 30);
		r4.setStroke(Color.WHITE);
		r4.setFill(Color.WHITE);
		
		
		pane4.add(r1, 0, 0);
		pane4.add(r2, 0, 1);
		pane4.add(r3, 1, 0);
		pane4.add(r4, 1, 1);
		
		gridPane.add(pane4, 1, 1);
		
		Scene scene = new Scene(gridPane, 500, 250);
		primaryStage.setTitle("GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
