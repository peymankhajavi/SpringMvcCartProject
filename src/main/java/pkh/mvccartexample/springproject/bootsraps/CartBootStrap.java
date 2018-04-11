package pkh.mvccartexample.springproject.bootsraps;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pkh.mvccartexample.springproject.repositories.*;


@Slf4j
@Component
public class CartBootStrap implements ApplicationListener<ContextRefreshedEvent> {


    private  CartRepository cartRepository;
    private  CartItemRepository cartItemRepository;
    private  CategoryRepository categoryRepository;
    private ProductConfigRepository productConfigRepository;
    private UserRepository userRepository;

    public CartBootStrap(CartRepository cartRepository, CartItemRepository cartItemRepository,
                         CategoryRepository categoryRepository, ProductConfigRepository
                                 productConfigRepository,UserRepository userRepository) {
        this.cartRepository = cartRepository;
        this.cartItemRepository = cartItemRepository;
        this.categoryRepository = categoryRepository;
        this.productConfigRepository = productConfigRepository;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        log.debug("Loading Bootstrap Data");
    }
}
