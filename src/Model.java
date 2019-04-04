import java.util.*;

public class Model {
	Bird bird;
	List<Collidable>onScreenCollidables;
	int distance;
	int endDistance;
	MiniMap miniMap;
	int points;
	boolean birdMode;
	boolean quizMode;
	List<QuizQuestion>quizQuestions;
	
	
	void update() {}
	
	void updateBird() {}
	
	void updateCollides() {}
	
	void updateBackground() {}
	
	void updateMiniMap() {}
	
	Collidable collisionDetection() {return null;}
	
	QuizQuestion startQuiz() {return new QuizQuestion();}
	
	void endQuiz() {}
	
	void spawnCollidables() {}
	
	void enterNest() {}
}
