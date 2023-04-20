package shopping.mall.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopping.mall.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "deliveryViews",
    path = "deliveryViews"
)
public interface DeliveryViewRepository
    extends PagingAndSortingRepository<DeliveryView, Long> {}
