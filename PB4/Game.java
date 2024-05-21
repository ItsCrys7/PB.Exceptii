package PB4;

public class Game {

	private String team1,team2;
	private int goalsteam1,goalsteam2,totalOut,totalCorners;
	
	public Game(String team1, String team2) {
		this.team1 = team1;
		this.team2 = team2;
		this.goalsteam1 = 0;
		this.goalsteam2 = 0;
		this.totalCorners = 0;
		this.totalOut = 0;
	}
	public String toString() {
		return this.team1+" ["+this.goalsteam1+"-"+this.goalsteam2+"] "+this.team2 + '\n'+"Out-uri: "+this.totalOut+'\n'+"Cornere: "+this.totalCorners;
	}
	public void play() {
		
		Ball b1 = new Ball(50,25);
		System.out.println("Incepe meciul intre "+this.team1+" VS "+this.team2);
		for(int i = 0;i < 1000;i++) {
			try {
				System.out.println(this.team1 + " VS "+this.team2 + " The ball has the coordonates (" + b1.getX() + "," + b1.getY() + ")");
				b1.shoot();
			} catch (Gol e) {
				if(b1.getX() <= 0)
					this.goalsteam2++;
				else this.goalsteam1++;
				System.out.println(e+" position " + b1);
				b1 = new Ball(50,25);
				
			} catch (Corner e) {
				this.totalCorners++;
				int newX,newY;
				if(b1.getX() == 100) newX = 100;
				else newX = 0;
				if(b1.getY()<20) newY = 0;
				else newY = 50;
				System.out.println(e + " position " + b1);
				b1 = new Ball(newX,newY);
			} catch (Out e) {
				this.totalOut++;
				System.out.println(e + " position " + b1);
				b1 = new Ball(b1.getX(),b1.getY());
			}
		}
		System.out.println("Finalul partidei! " + this.team1 + " - " + this.team2);
	}
	public String getteam1() {
		return team1;
	}
	public String getteam2() {
		return team2;
	}
	public int getgoalsteam1() {
		return goalsteam1;
	}
	public int getgoalsteam2() {
		return goalsteam2;
	}
	public int getTotalOut() {
		return totalOut;
	}
	public int gettotalCorners() {
		return totalCorners;
	}
	public void simulate() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'simulate'");
	}
	
}

