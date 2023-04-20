package shopping.mall.domain;

import java.util.*;
import lombok.*;
import shopping.mall.domain.*;
import shopping.mall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private String id;
    private String orderId;
    private String customerId;
    private String address;
    private String status;

    public DeliveryCancelled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancelled() {
        super();
    }
}
