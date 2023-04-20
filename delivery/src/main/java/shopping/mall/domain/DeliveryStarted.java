package shopping.mall.domain;

import java.util.*;
import lombok.*;
import shopping.mall.domain.*;
import shopping.mall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private String id;
    private String orderId;
    private String customerId;
    private String address;
    private String status;

    public DeliveryStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
