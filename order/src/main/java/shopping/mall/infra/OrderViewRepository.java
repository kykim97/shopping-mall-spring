package shopping.mall.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shopping.mall.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "orderViews",
    path = "orderViews"
)
public interface OrderViewRepository
    extends PagingAndSortingRepository<OrderView, Long> {}
