package pkh.mvccartexample.springproject.repositories;


import org.springframework.data.repository.CrudRepository;
import pkh.mvccartexample.springproject.domain.CartItem;


public interface CartItemRepository extends CrudRepository<CartItem,Long>{
}
