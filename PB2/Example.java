package PB2;

public class Example {

	public void doSomething(int i){
		try {
			if(i == 0) throw new EX1();
			else throw new EX2();
		} catch(EX1 e) {
		System.out.println("Prins");
		}
	}
}