package pkh.mvccartexample.springproject.services;


import pkh.mvccartexample.springproject.commands.CartCommand;
import pkh.mvccartexample.springproject.domain.Cart;

import java.util.Set;

public interface CartService {

    Set<Cart> getCarts();

    Cart findById(Long l);

    CartCommand findCommandById(Long l);

    CartCommand saveCartCommand(CartCommand command);

    void deleteById(Long idToDelete);

}
