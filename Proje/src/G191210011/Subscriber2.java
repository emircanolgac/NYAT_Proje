package G191210011;

public class Subscriber2 implements IObserver{
	@Override
	public void update(String message) {
		System.out.println("Abone2 için gelen mesaj: " + message);
	}
}