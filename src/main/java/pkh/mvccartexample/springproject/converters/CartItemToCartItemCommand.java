package pkh.mvccartexample.springproject.converters;


import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import lombok.Synchronized;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import pkh.mvccartexample.springproject.commands.CartItemCommand;
import pkh.mvccartexample.springproject.domain.CartItem;
import sun.util.resources.cldr.aa.CalendarData_aa_DJ;

@Component
public class CartItemToCartItemCommand implements Converter<CartItem,CartItemCommand>{
    @Synchronized
    @Nullable
    @Override
    public CartItemCommand convert(CartItem cartItem) {
        if(cartItem ==null)
        {
            return null;
        }
        CartItemCommand cartItemCommand = new CartItemCommand();
        cartItemCommand.setCart(cartItem.getCart());
        cartItemCommand.setDescription(cartItem.getDescription());
        cartItemCommand.setId(cartItem.getId());
        cartItemCommand.setPayable(cartItem.getPayable());
        cartItemCommand.setProductConfig(cartItem.getProductConfig());

        return cartItemCommand;
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
