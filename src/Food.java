
public class Food extends GameElement implements Collidable{
	int staminaValue;
	boolean isSpecialFood;
	
	void eaten() {}
	
	public boolean isOffScreen() {
		return true;
	}
}
