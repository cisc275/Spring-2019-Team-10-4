import java.util.*;
public class QuizQuestion {
	/**
	 * An int that stores the index of the correct answer
	 */
	int correctAnswer;
	/**
	 * The question that the player needs to answer
	 */
	String question;
	/**
	 * A list of potential answers to the multiple choice question
	 */
	List<String>answers;
	
	/**
	 * Checks whether the question has been answered correctly
	 * 
	 * @return True is answered correct, false otherwise.
	 */
	boolean checkCorrect() {return false;}
}
