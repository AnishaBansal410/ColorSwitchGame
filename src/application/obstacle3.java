package application;

import javafx.scene.shape.Arc;
import javafx.scene.shape.Rectangle;

public class obstacle3 extends obstacle {
	
	
	public obstacle3(Rectangle r1,Rectangle r2,Rectangle r3,Rectangle r4)
	{
		super();
		this.getChildren().add(r1);
		this.getChildren().add(r2);
		this.getChildren().add(r3);
		this.getChildren().add(r4);
		this.orientation="square";
	}
	
}
