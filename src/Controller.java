import java.awt.event.*;
import javax.swing.JButton;

public class Controller implements KeyListener{
	View view;
	Model model;
	JButton button;
	KeyEvent keyInputs;
	
	void start() {}
	
	@Override
	public void keyPressed(KeyEvent k) {}

	@Override
	public void keyReleased(KeyEvent k) {}

	@Override
	public void keyTyped(KeyEvent k) {}
	
	public static void main(String[] args) {
		System.out.println("Welcome");
	}
}
