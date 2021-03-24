import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class Consumer {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.244.133:9092");
        // 提交的是消费的offset
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG,"1000");
        // 开启自动提交
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,true);
        // 反序列化
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.GROUP_ID_CONFIG,"rule-engine-consumer");
        KafkaConsumer<String,String>  kafkaConsumer = new KafkaConsumer<String,String>(properties);
        // 主题
        kafkaConsumer.subscribe(Arrays.asList("spark"));
        // 获取数据
        while(true){
            ConsumerRecords<String,String> consumerRecords = kafkaConsumer.poll(100);
            for(ConsumerRecord<String,String> consumerRecord:consumerRecords){
                System.out.println(consumerRecord.value());
            }
        }
    }
}
