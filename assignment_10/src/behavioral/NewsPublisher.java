package behavioral;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
    // You need to implement this class
    private List<NewsReader> subscribers;

    NewsPublisher() {
        subscribers = new LinkedList<NewsReader>();
    }

    @Override
    public void subscribe(Subscriber<? super News> subscriber) {
        subscribers.add((NewsReader) subscriber);
    }

    public void publish(News news) {
        subscribers.stream().forEach(subscriber -> subscriber.update(news));
    }
}
