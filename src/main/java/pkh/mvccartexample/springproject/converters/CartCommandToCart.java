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
public class CartCommandToCart implements Converter<CartCommand,Cart> {

    @Synchronized
    @Nullable
    @Override
    public Cart convert(CartCommand source) {
        if(source ==null)
        {
            return null;
        }
        final Cart cart=new Cart();
        cart.setId(source.getId());
        cart.setRegisterId(source.getRegisterId());
        cart.setRegisterDate(source.getRegisterDate());
        cart.setCartItems(source.getCartItems());
        cart.setDescription(source.getDescription());
        cart.setPayable(source.getPayable());
        return cart;
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
