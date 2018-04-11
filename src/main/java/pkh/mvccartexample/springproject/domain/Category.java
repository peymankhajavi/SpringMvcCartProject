package pkh.mvccartexample.springproject.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    public String categoryName;

    @Lob
    public String description;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    public Set<ProductConfig> productConfigs =new HashSet<>();

    public Category addProductConfig(ProductConfig productConfig)
    {
        productConfig.setCategory(this);
        this.productConfigs.add(productConfig);
        return this;
    }


}
