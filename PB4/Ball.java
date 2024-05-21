package PB4;

import java.util.concurrent.ThreadLocalRandom;

public class Ball {

	private int coordonataX, coordonataY;

	public Ball(int coordonataX, int coordonataY) {
		this.coordonataX = coordonataX;
		this.coordonataY = coordonataY;
	}
	public void suteaza(int coordonataX, int coordonataY) throws Gol, Corner, Out{
		this.coordonataX = coordonataX;
		this.coordonataY = coordonataY;
		checkBallPosition();
	}
	public void suteaza() throws Gol, Corner, Out{
		this.coordonataX = ThreadLocalRandom.current().nextInt(0,101);
		this.coordonataY = ThreadLocalRandom.current().nextInt(0,51);
		checkBallPosition();
	}
	public void checkBallPosition() throws Out, Gol, Corner {
		if(this.coordonataY <= 0 || this.coordonataY >= 50)
			throw new Out();
		if(this.coordonataX <= 0 || this.coordonataX >= 100) {
			if(this.coordonataY >= 20 && this.coordonataY <= 30)
				throw new Gol();
			else
				throw new Corner();
		}
	}
	public int getX() {
		return coordonataX;
	}
	public int getY() {
		return coordonataY;
	}
	public String toString() {
		return "("+this.getX() + ","+this.getY() + ")";
	}
    public void shoot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shoot'");
    }
	
}

