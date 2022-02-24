# kafka-samples

## resources

* [Kafka Using Docker](https://www.baeldung.com/ops/kafka-docker-setup)
* https://russianblogs.com/article/27351956199/

## commands

* docker exec -ti ci_kafka_1 bash
* [Apache Kafka Quickstart](https://kafka.apache.org/quickstart)
  * Step 3. Create a topic to store your events: kafka-topics --create --topic quickstart-events --bootstrap-server localhost:29092
  * Step 4. Write some events into the topic: kafka-console-producer --topic quickstart-events --bootstrap-server localhost:29092
  * Step 5. Read the events: kafka-console-consumer --topic quickstart-events --from-beginning --bootstrap-server localhost:29092


