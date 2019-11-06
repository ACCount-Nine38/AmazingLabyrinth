package states;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import utility.CustomizationTool;

public abstract class State extends JFrame implements ActionListener {
	
	public static final int ScreenWidth = 1280;
	public static final int ScreenHeight = 800;
	
	public State() {
		
		init();
		addJComponents();
		CustomizationTool.frameSetup(this);
		CustomizationTool.customCursor(this);
		
	}
	
	public abstract void addJComponents();
	
	public abstract void init();

}