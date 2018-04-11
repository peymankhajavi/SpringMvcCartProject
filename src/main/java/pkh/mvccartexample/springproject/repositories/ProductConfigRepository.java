package pkh.mvccartexample.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pkh.mvccartexample.springproject.domain.ProductConfig;

public interface ProductConfigRepository extends CrudRepository<ProductConfig,Long> {
}
