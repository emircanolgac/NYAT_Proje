package G191210011;

public class Subscriber1 implements IObserver{
	@Override
	public void update(String message) {
		System.out.println("Abone1 için gelen mesaj: " + message);
	}
}
