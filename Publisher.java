class Publisher {
    Broker broker;
    Publisher(Broker broker) { this.broker = broker; }

    void publish(String content) {
        broker.notifySubscribers(content);
    }
}

