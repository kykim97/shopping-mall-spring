package shopping.mall.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import shopping.mall.config.kafka.KafkaProcessor;
import shopping.mall.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderPlaced'"
    )
    public void wheneverOrderPlaced_StartDelivery(
        @Payload OrderPlaced orderPlaced
    ) {
        OrderPlaced event = orderPlaced;
        System.out.println(
            "\n\n##### listener StartDelivery : " + orderPlaced + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCancelled'"
    )
    public void wheneverOrderCancelled_CancelDelivery(
        @Payload OrderCancelled orderCancelled
    ) {
        OrderCancelled event = orderCancelled;
        System.out.println(
            "\n\n##### listener CancelDelivery : " + orderCancelled + "\n\n"
        );
        // Sample Logic //

    }
}
