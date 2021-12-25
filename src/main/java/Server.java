import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import java.io.IOException;

public class Server {
    private static final String SERVER = "localhost";
    private static final Integer PORT = 8080;
    private static final String TEST_URL = "testUrl";
    private static final String COUNT = "count";
    private static final int MAP_ASYNC = 1;
    private static final Integer TIME_OUT_MILLIS = 5000;

    public static void main(String[] args) throws IOException {
        System.out.println("Start!");
        ActorSystem system = ActorSystem.create("routes");
        ActorRef actor = system.actorOf(Props.create(ActorRec.class));

    }

}
