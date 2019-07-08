package model;
/**
 * <h1>The Grid Class</h1>
 * 
 * @author KAMDEM
 * @version 1.0
 */

/**
 * @author KAMDEM
 * @version 1.0
 */
import java.awt.Color;

import DAO.Datamanager;



public class Grid implements IGrid{
	
	
	private IPlayer rider1;
	private IPlayer rider2;
	private int width = 600;
	private int height = 400;
	private int nbCelsHeight=40;
	private int nbCelsWidth=60;
	private ITimer timer;
	private Datamanager db = new Datamanager();

	
	

	/**
	 * Constructeur
	 * Met en place 2 riders sur la grid
	 */
	public Grid () {
		this.rider1= new Player(2,2,Color.yellow,Direction.EST,this);
		this.rider2= new Player(30,30,Color.blue,Direction.OUEST,this);
		this.timer= new timer();
		timer.start();
	}
	
	/**
	 * Vérifie les colision du rider
	 * Vérifie si le rider est dans les colision
	 * @param player
	 * @return boolean colision
	 * 
	 */
	public boolean checkColision(Player player) {
		if(player.getX()>this.nbCelsWidth || player.getX()<=0 || player.getY()<=0 || player.getY()>this.nbCelsHeight) {player.setAlive(false); return true;} 
		
		for (IElements particle : rider1.getParticles()) {
			if(player.getX() == particle.getX() && player.getY() == particle.getY()) {player.setAlive(false);return true;}
		}
		
		for (IElements particle : rider2.getParticles()) {
			if(player.getX() == particle.getX() && player.getY() == particle.getY()) {player.setAlive(false);return true;}
	
	}
		return false;
	
}
	/**
	 * @see model.IGrid#getRider1()
	 */
	@Override
	public IPlayer getRider1() {
		return rider1;
	}

	/**
	 * Set rider 1
	 */
	public void setRider1(Player rider1) {
		this.rider1 = rider1;
	}
	/**
	 * @see model.IGrid#getRider2()
	 */
	@Override
	public IPlayer getRider2() {
		return rider2;
	}

	/**
	 * Set rider 2
	 */
	public void setRider2(Player rider2) {
		this.rider2 = rider2;
	}
	/**
	 * @see model.IGrid#getWidth()
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * Set la largeur
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @see model.IGrid#getHeight()
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * set la hauteur en pixel
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @see model.IGrid#getNbCelsHeight()
	 */
	@Override
	public int getNbCelsHeight() {
		return nbCelsHeight;
	}


	public void setNbCelsHeight(int nbCelsHeight) {
		this.nbCelsHeight = nbCelsHeight;
	}
	/**
	 * @see model.IGrid#getNbCelsWidth()
	 */
	@Override
	public int getNbCelsWidth() {
		return nbCelsWidth;
	}


	public void setNbCelsWidth(int nbCelsWidth) {
		this.nbCelsWidth = nbCelsWidth;
	}
	@Override
	public ITimer getTimer() {
		return timer;
	}
	@Override
	public void save() {
		
		if(rider1.isAlive()) {
			db.save(2, (int) timer.getTime());}
		else {
			db.save(1, (int) timer.getTime());}
		}
		

}

	
	
	
	
	
	
	
	
	
	
	

