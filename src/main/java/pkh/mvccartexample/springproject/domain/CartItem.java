package pkh.mvccartexample.springproject.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public Long payable;

    @Lob
    public String description;

    @ManyToOne
    public Cart cart;

    @ManyToOne
    public ProductConfig productConfig;





}
