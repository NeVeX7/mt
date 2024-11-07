public class PublishSubscribeExample {
    public static void main(String[] args) {
        Broker broker = new Broker();

        broker.subscribe(msg -> System.out.println("Subscriber 1 received: " + msg));
        broker.subscribe(msg -> System.out.println("Subscriber 2 received: " + msg));

        Publisher publisher = new Publisher(broker);
        publisher.publish("Hello, Subscribers!");
        publisher.publish("Another message!");
    }
}

