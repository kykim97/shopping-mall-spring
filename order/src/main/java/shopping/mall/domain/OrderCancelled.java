package shopping.mall.domain;

import java.util.*;
import lombok.*;
import shopping.mall.domain.*;
import shopping.mall.infra.AbstractEvent;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private String id;
    private String productId;
    private Integer qty;
    private String customerId;
    private String status;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
