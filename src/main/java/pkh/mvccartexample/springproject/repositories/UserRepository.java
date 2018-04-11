package pkh.mvccartexample.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pkh.mvccartexample.springproject.domain.User;


public interface UserRepository extends CrudRepository<User,Long> {
}
