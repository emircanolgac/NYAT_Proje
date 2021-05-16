package G191210011;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject{
	private List<IObserver> subscribers = new ArrayList<>();

	@Override
	public void attach(IObserver subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void detach(IObserver susbscribe) {
		subscribers.remove(susbscribe);
	}

	@Override
	public void notify(String message) {
		for(IObserver subscriber: subscribers) {
			subscriber.update(message);
		}
	}
}