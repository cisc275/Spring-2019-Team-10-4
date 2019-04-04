import java.util.*;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Dimension;

public class View extends JPanel{
	JFrame frame;
	DrawPanel drawPanel;
	int frameWidth;
	int frameHeight;
	BufferedImage background;
	
	void updateView(Bird bird, List<Collidable>collidables,MiniMap miniMap) {}
	
	void createImage() {}
	
	void drawImage() {}
	
	void displayQuiz() {}
	
	void nestAnimation() {}
	
	int selectBird() {return 0;}
	
	void updateBird() {}
	
	void updateCollidables() {}
	
	void updateMiniMap() {}
	
	void updateBackground() {}
	
	@SuppressWarnings("serial")
	private class DrawPanel extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);			
		}

		public Dimension getPreferredSize() {
			return new Dimension(0, 0);
		}
	}
	
	
}
