package pkh.mvccartexample.springproject.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class ProductConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public String configName;

    public Integer countItem;

    @Enumerated(value = EnumType.STRING)
    public Color color;

    @ManyToOne
    public Category category;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "productConfig")
    public Set<CartItem> cartItems=new HashSet<>();

    public ProductConfig addCartItem(CartItem cartItem)
    {
        cartItem.setProductConfig(this);
        this.cartItems.add(cartItem);
        return this;
    }


}
