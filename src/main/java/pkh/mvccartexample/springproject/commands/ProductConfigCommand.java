package pkh.mvccartexample.springproject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pkh.mvccartexample.springproject.domain.CartItem;
import pkh.mvccartexample.springproject.domain.Category;
import pkh.mvccartexample.springproject.domain.Color;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ProductConfigCommand {

    public Long Id;
    public String configName;
    public Integer countItem;
    public Color color;
    public Category category;
    public Set<CartItem> cartItems=new HashSet<>();

}
