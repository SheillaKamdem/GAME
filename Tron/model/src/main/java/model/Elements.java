package model;
/**
 * @author KAMDEM
 * @version 1.0
 */

/**
 * <h1>The Element Class</h1>
 * 
 * @author Roxane-Vonarb
 * @version 1.0
 */
import java.awt.Color;
import java.util.Observable;


public class Elements extends Observable implements IElements{
	
	public Elements(int x, int y, Color color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	
	protected int x;
	protected int y;
	protected Color color;
	
	
	/**
	 * (non-Javadoc)
	 * @see model.IElements#getX()
	 */
	@Override
	public int getX() {
		return x;
	}
	/**
	 * Met en place le x de l'élement
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IElements#getY()
	 */
	@Override
	public int getY() {
		return y;
	}
	/**
	 * Met en place le y de l'élement
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IElements#getColor()
	 */
	@Override
	public Color getColor() {
		return color;
	}
	/**
	 * Set la couleur de l'élement
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
}
