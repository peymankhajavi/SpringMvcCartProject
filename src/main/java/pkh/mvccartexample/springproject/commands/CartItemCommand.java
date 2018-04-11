package pkh.mvccartexample.springproject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pkh.mvccartexample.springproject.domain.Cart;
import pkh.mvccartexample.springproject.domain.ProductConfig;


@Getter
@Setter
@NoArgsConstructor
public class CartItemCommand {
    public Long Id;
    public Long payable;
    public String description;
    public Cart cart;
    public ProductConfig productConfig;
}
