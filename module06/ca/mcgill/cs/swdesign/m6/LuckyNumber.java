package ca.mcgill.cs.swdesign.m6;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Martin P. Robillard
 *
 * Class to demonstrate the Observer design pattern 
 * in Java. Note that there are many ways to implement an
 * Observer design pattern, and that this is just one of them.
 */
public class LuckyNumber extends Application
{
	public static final int WIDTH = 200;
	
	private static final int GAP = 10;
	private static final int MARGIN = 20;
	
	/**
	 * Launches the application.
	 * @param pArgs This program takes no argument.
	 */
	public static void main(String[] pArgs) 
	{
        launch(pArgs);
    }
    
    @Override
    public void start(Stage pPrimaryStage) 
    {
    	Model model = new Model();
    	
    	GridPane root = createPane(); // The root of the GUI component graph
    	root.add(new SliderPanel(model), 0, 0, 1, 1);
    	root.add(new IntegerPanel(model), 0, 1, 1, 1);
    	root.add(new TextPanel(model), 0, 2, 1, 1);
    	
    	pPrimaryStage.setTitle("Lucky Number");
    	pPrimaryStage.setResizable(false);
        pPrimaryStage.setScene(new Scene(root));
        pPrimaryStage.show();
    }
    
    /*
     * Helper method to hid the details of creating
     * a nice looking grid.
     */
    private static GridPane createPane()
    {
    	GridPane root = new GridPane();
    	root.setHgap(GAP);
    	root.setVgap(GAP);
    	root.setPadding(new Insets(MARGIN));
    	return root;
    }
}




