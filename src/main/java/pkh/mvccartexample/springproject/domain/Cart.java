package pkh.mvccartexample.springproject.domain;

import lombok.Getter;
import lombok.Setter;
import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public Long payable;

    @Lob
    public String description;

    public Date registerDate;

    @ManyToOne
    public User registerId;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "cart")
    public Set<CartItem> cartItems =new HashSet<>();

    public Cart addCartItem(CartItem cartItem)
    {
        cartItem.setCart(this);
        this.cartItems.add(cartItem);
        return this;
    }


}
