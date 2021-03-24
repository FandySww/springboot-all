import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class Producer {
    public static void main(String[] args) {
        // 创建kafka生产者的配置信息
        Properties properties = new Properties();
        // 连接的kafka集群信息
        properties.put("bootstrap.servers", "192.168.244.133:9092");
//        properties.put("bootstrap.servers", "kafka04-test.lianjia.com:9092,kafka05-test.lianjia.com:9092,kafka06-test.lianjia.com:9092");
        properties.put("acks", "all");
        //重试次数
        properties.put("retries", 1);
        //批次大小16k
        properties.put("batch.size", 16384);
        //等待时间 16k满足或者1ms满足就开始发送信息
        properties.put("linger.ms", 1);
        //RecordAccumulator 缓冲区大小 32M
        properties.put("buffer.memory", 33554432);
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        // 创建生产者对象
        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
        for (int i = 0; i < 1000; i++) {
            producer.send(new ProducerRecord<String, String>("riskctrl-riskManager-bizlog", "testKey", "kafka-test12334" + "  " + i));
//            producer.send(new ProducerRecord<String, String>("riskctrl-riskManager-strategy-rollback", "testKey", "kafka-test12334" + "  " + i));
        }
        System.out.println("success");
        // 不满足发送条件的话是不发送的1ms和16K
        producer.close();
    }
}
