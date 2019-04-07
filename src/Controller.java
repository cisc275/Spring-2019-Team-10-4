import java.awt.event.*;
import javax.swing.JButton;

public class Controller implements KeyListener{
	/**
	 * The view for the game
	 */
	View view;
	/**
	 * The model for the game
	 */
	Model model;
	/**
	 * A button for the user to click
	 */
	JButton button;
	/**
	 * Stores the key inputs by the player
	 */
	KeyEvent keyInputs;
	
	/**
	 * Starts the game play. Will then prompt user to choose a bird to play as.
	 * Will update game as it progresses and end the game when the nest is reached.
	 */
	void start() {}
	
	/**
	 * Required from KeyListener. Will handle any key presses by the player
	 * 
	 * @param k The KeyEvent entered by the player
	 */
	@Override
	public void keyPressed(KeyEvent k) {}

	/**
	 * Required from KeyListener. Will handle any key releases by the player
	 * 
	 * @param k The KeyEvent entered by the player
	 */
	@Override
	public void keyReleased(KeyEvent k) {}

	/**
	 * Required from KeyListener. Will handle any key types by the player
	 * 
	 * @param k The KeyEvent entered by the player
	 */
	@Override
	public void keyTyped(KeyEvent k) {}
	
	/**
	 * Will call the start method when run.
	 * 
	 * @param args Unused
	 */
	public static void main(String[] args) {
		System.out.println("Welcome");
	}
}
