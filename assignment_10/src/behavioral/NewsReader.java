package behavioral;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsReader extends NewsSubscriber{
    NewsReader(String announcer){
        super(announcer);
    }
}
