package pkh.mvccartexample.springproject.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public String firstName;
    public String lastName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "registerId")
    public Set<Cart> carts=new HashSet<>();

    public User addCarts(Cart cart )
    {
        cart.setRegisterId(this);
        this.carts.add(cart);
        return this;

    }


}
