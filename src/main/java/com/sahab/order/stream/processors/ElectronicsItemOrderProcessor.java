package com.sahab.order.stream.processors;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sahab.order.common.model.OrderDetails;

@Component
public class ElectronicsItemOrderProcessor {
	@Value("${kafka.topic.electronics-output}")
    private String evenOutput;

    public void process(KStream<String, OrderDetails> stream){
        stream
                .filter((k, v) -> v.getOrderId().endsWith("Electronics"))
                .mapValues(v -> {
                    System.out.println("Mapping order for electronics " + v);
                    return v ;
                })
                .to(evenOutput);
    }
}
