package pkh.mvccartexample.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pkh.mvccartexample.springproject.domain.Cart;

public interface CartRepository extends CrudRepository<Cart,Long> {
}
