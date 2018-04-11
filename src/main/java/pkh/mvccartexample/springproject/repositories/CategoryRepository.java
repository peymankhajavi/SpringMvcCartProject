package pkh.mvccartexample.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pkh.mvccartexample.springproject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
