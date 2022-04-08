package behavioral;

import java.util.concurrent.Flow;

public class NewsReader implements Flow.Subscriber<News> {
    // You need to implement this class
    private String announcer;

    NewsReader(String announcer) {
        this.announcer = announcer;
    }

    public void update(News news) {
        System.out.println("announcer : " + this.announcer);
        System.out.println("topic : " + news.getTopic());
        System.out.println("content : " + news.getContent());
        System.out.println("===============================");
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {

    }

    @Override
    public void onNext(News item) {

    }

    @Override
    public void onError(Throwable throwable) {
    }

    @Override
    public void onComplete() {

    }
}
