package pkh.mvccartexample.springproject.converters;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import lombok.Synchronized;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import pkh.mvccartexample.springproject.commands.CartCommand;
import pkh.mvccartexample.springproject.domain.Cart;


@Component
public class CartToCartCommand implements Converter<Cart,CartCommand> {
    @Synchronized
    @Nullable
    @Override
    public CartCommand convert(Cart cart) {
        if(cart==null)
        {
            return null;
        }
        final CartCommand cartCommand =new CartCommand();
        cartCommand.setId(cart.getId());
        cartCommand.setCartItems(cart.getCartItems());
        cartCommand.setDescription(cart.getDescription());
        cartCommand.setPayable(cart.getPayable());
        cartCommand.setRegisterId(cart.getRegisterId());
        cartCommand.setRegisterDate(cart.getRegisterDate());

        return cartCommand;
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }
}
