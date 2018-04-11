package pkh.mvccartexample.springproject.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pkh.mvccartexample.springproject.domain.Cart;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class UserCommand {

    public Long Id;
    public String firstName;
    public String lastName;
    public Set<Cart> carts=new HashSet<>();
}
