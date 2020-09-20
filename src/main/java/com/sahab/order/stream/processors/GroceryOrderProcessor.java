package com.sahab.order.stream.processors;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sahab.order.common.model.OrderDetails;

@Component
public class GroceryOrderProcessor {
	@Value("${kafka.topic.grocery-output}")
    private String evenOutput;

	 public void process(KStream<String, OrderDetails> stream){
	        stream
	                .filter((k, v) -> v.getOrderId().endsWith("Grocery"))
	                .mapValues(v -> {
	                    System.out.println("Mapping order for Grocery" + v);
	                    return v ;
	                })
	                .to(evenOutput);
	    }
}
