package PB4;

public class Main {
	public static void main(String[] args) {
		Game Game1 = new Game("ROU","ALG");
		Game Game2 = new Game("DAN","BRZ");
		
		Game1.simulate();
		Game2.simulate();
		System.out.println(Game1);
		System.out.println(Game2);
	}
}
