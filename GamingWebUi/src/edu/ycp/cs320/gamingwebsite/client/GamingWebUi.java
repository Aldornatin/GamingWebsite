package edu.ycp.cs320.gamingwebsite.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.RootLayoutPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GamingWebUi implements EntryPoint {
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		

		RootLayoutPanel rootLayoutPanel = RootLayoutPanel.get();
		//MemView view = new MemView();
//		image = (ImageElement) new Image("CardImage/star1.jpg").getElement().cast(); 
//		RootPanel.get().add(canvas, 10, 0);
		
		loginView view = new loginView();
		MemView view2 = new MemView();
		
		if(view.getpages()==false){
			rootLayoutPanel.add(view);
			RootLayoutPanel.get().setWidgetTopBottom(view, 0.0, Unit.PX, 0.0, Unit.PX);
			RootLayoutPanel.get().setWidgetLeftRight(view, 0.0, Unit.PX, 0.0, Unit.PX);
			
			}else{
				//we are re commitng
			rootLayoutPanel.add(view2);
			RootLayoutPanel.get().setWidgetTopBottom(view2, 0.0, Unit.PX, 0.0, Unit.PX);
			RootLayoutPanel.get().setWidgetLeftRight(view2, 0.0, Unit.PX, 0.0, Unit.PX);
			view2.update();
			
		}
	} 
	
	private void Update() {
		// TODO Auto-generated method stub this is where cody says memgame is going to go
		
	} 
}
