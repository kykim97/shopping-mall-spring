package shopping.mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DeliveryView_table")
@Data
public class DeliveryView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
