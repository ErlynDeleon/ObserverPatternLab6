import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {
    private List<SubscriberObserver> subscribers = new ArrayList<>();

    @Override
    public void subscribe(SubscriberObserver subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added: " + ((Subscriber) subscriber).getName());
    }

    @Override
    public void unsubscribe(SubscriberObserver subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed: " + ((Subscriber) subscriber).getName());
    }

    @Override
    public void notifySubscribers(String news) {
        for (SubscriberObserver subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("\nPublishing news: " + news);
        notifySubscribers(news);
    }
}