package pkh.mvccartexample.springproject.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pkh.mvccartexample.springproject.commands.CartCommand;
import pkh.mvccartexample.springproject.converters.CartCommandToCart;
import pkh.mvccartexample.springproject.converters.CartToCartCommand;
import pkh.mvccartexample.springproject.domain.Cart;
import pkh.mvccartexample.springproject.repositories.CartRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class CartServiceImp implements CartService {

    private final CartRepository cartRepository;
    private final CartToCartCommand cartToCartCommand;
    private final CartCommandToCart cartCommandToCart;


    public CartServiceImp(CartRepository cartRepository, CartToCartCommand cartToCartCommand, CartCommandToCart cartCommandToCart) {
        this.cartRepository = cartRepository;
        this.cartToCartCommand = cartToCartCommand;
        this.cartCommandToCart = cartCommandToCart;
    }


    @Override
    public Set<Cart> getCarts() {
        log.debug("serviceeeeeee ");

        Set<Cart> carts=new HashSet<>();
        cartRepository.findAll().iterator().forEachRemaining(carts::add );
        return carts;

    }

    @Override
    public Cart findById(Long l) {
        Optional<Cart> cart=cartRepository.findById(l);

        if(!cart.isPresent())
        {
            throw new RuntimeException("cart not fount");
        }

        return cart.get();

    }

    @Override
    @Transactional
    public CartCommand findCommandById(Long l) {
        return cartToCartCommand.convert(findById(l));
    }

    @Override
    public CartCommand saveCartCommand(CartCommand command) {
        Cart  cart=cartCommandToCart.convert(command);

        Cart savedCart = cartRepository.save(cart);
        log.debug("Saved CartId:" + savedCart.getId());
        return cartToCartCommand.convert(savedCart);
    }

    @Override
    public void deleteById(Long idToDelete) {
      cartRepository.deleteById(idToDelete);
    }
}
