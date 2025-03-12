interface Playable{
	void play();
}
class Guitar implements Playable{
	@Override
	public void play() {
		System.out.println("Guitar is playing");
	}
}

class Piano implements Playable{
	@Override
	public void play() {
		System.out.println("Piano is playing.");
	}
}
public class Main {
	public static void main(String[] args) {
		
	Playable p;
	
	p = new Guitar();
	p.play();
	
	p = new Piano();
	p.play();
	}
}
