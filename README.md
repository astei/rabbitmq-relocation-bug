This is the bare minimum program that triggers [issue 436](https://github.com/rabbitmq/rabbitmq-java-client/issues/436).

To reproduce:

1. Build the JAR with `mvn package`.
2. Run the JAR with `java -jar target/rabbitmq-relocation-bug-1.0-SNAPSHOT.jar`.
3. Observe the spurious warnings emitted by the library. `rabbitmq-amqp-client.properties` exists and has the proper content, but the library will use the wrong key if relocated.
4. Further note that the version printed is `0.0.0`, not `5.5.1` as it should be.