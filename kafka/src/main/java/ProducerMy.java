import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducerMy {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "192.168.244.133:9092");
        properties.put("acks", "all");
        properties.put("retries", 1);
        properties.put("batch.size", 16384);
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", 33554432);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
        for (int i = 0; i < 1000; i++) {
            producer.send(new ProducerRecord<String, String>("spark", "testKey", "kafka-test12334" + "  " + i));
        }
        System.out.println("success");
        // 不满足发送条件的话是不发送的1ms和16K
        producer.close();
    }
}
