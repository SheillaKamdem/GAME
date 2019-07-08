package model;
/**
 * <h1>Class Player</h1>
 * 
 * 
 * @version 1.0
 */
import java.awt.Color;
import java.util.ArrayList;

public class Player extends Elements implements IPlayer , IElements{
	protected Direction direction;
	public ArrayList<IElements> particles = new ArrayList<IElements>();
	boolean alive = true;
	public Grid grid;

	
/**
 * Constructor
 * @param x,y,color,direction,grid
 * 
 * 	
 */
public Player(int x, int y, Color color , Direction direction,Grid grid) {
		super(x, y, color);
		this.direction=direction;
		this.grid=grid;
		// TODO Auto-generated constructor stub
	}



/**
 * (non-Javadoc)
 * @see model.IPlayer#move()
 */
public void move() {
	this.particles.add(0, new Particles(this.x, this.y, this.color));
	switch(this.direction) {
	case EST: this.x=x+1;
		break;
	case NORD: this.y=y-1;
		break;
	case OUEST: this.x=x-1;
		break;
	case SUD: this.y=y+1;
		break;
	default:
		break;
	}
	
	grid.checkColision(this);
	this.setChanged();
	this.notifyObservers();
	
	
}



/**
 * (non-Javadoc)
 * @see model.IPlayer#isAlive()
 */
public boolean isAlive() {
	return alive;
}


/**
 * set rider alive status
 */
public void setAlive(boolean alive) {
	this.alive = alive;
}


/**
 * (non-Javadoc)
 * @see model.IPlayer#getParticles()
 */

@Override
public ArrayList<IElements> getParticles() {
	// TODO Auto-generated method stub
	return particles;
}
/**
 * (non-Javadoc)
 * @see model.IPlayer#turnRight()
 */
@Override
public void turnRight() {
	switch(this.direction) {
	case NORD: direction = Direction.EST;break;
	case EST: direction = Direction.SUD;break;
	case SUD: direction = Direction.OUEST;break;
	case OUEST: direction = Direction.NORD;break;
	}
	
}
/**
 * (non-Javadoc)
 * @see model.IPlayer#turnLeft()
 */
@Override
public void turnLeft() {
		switch(this.direction) {
		case NORD: direction = Direction.OUEST;break;
		case EST: direction = Direction.NORD;break;
		case SUD: direction = Direction.EST;break;
		case OUEST: direction = Direction.SUD;break;
		}
	
}


	


	
	

	
}
