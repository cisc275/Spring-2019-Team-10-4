import java.util.*;

/**
 * Represents a quiz question that will be prompted throughout the game.
 * There are multiple questions.
 * 
 * @author 10-4
 *
 */
public class QuizQuestion {
	/**
	 * An int that stores the index of the correct answer
	 */
	private int correctAnswer;
	/**
	 * The question that the player needs to answer
	 */
	private String question;
	/**
	 * A list of potential answers to the multiple choice question
	 */
	private List<String>answers;
	
	/**
	 * Checks whether the question has been answered correctly
	 * 
	 * @return True is answered correct, false otherwise.
	 */
	boolean checkCorrect() {return false;}
}
