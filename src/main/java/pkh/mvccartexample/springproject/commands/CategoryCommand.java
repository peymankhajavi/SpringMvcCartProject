package pkh.mvccartexample.springproject.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pkh.mvccartexample.springproject.domain.ProductConfig;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class CategoryCommand {

    public Long Id;
    public String categoryName;
    public String description;
    public Set<ProductConfig> productConfigs =new HashSet<>();

}
