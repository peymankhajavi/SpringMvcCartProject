package pkh.mvccartexample.springproject.converters;


import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import lombok.Synchronized;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import pkh.mvccartexample.springproject.commands.CartItemCommand;
import pkh.mvccartexample.springproject.domain.CartItem;


@Component
public class CartItemCommandToCartItem implements Converter<CartItemCommand,CartItem> {

    @Synchronized
    @Nullable
    @Override
    public CartItem convert(CartItemCommand source) {
        if(source ==null)
        {
            return null;
        }
        final CartItem cartItem=new CartItem();
        cartItem.setCart(source.getCart());
        cartItem.setProductConfig(source.getProductConfig());
        cartItem.setDescription(source.getDescription());
        cartItem.setId(source.getId());
        cartItem.setPayable(source.getPayable());

        return cartItem;

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
