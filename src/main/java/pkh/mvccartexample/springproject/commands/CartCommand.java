package pkh.mvccartexample.springproject.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import pkh.mvccartexample.springproject.domain.CartItem;
import pkh.mvccartexample.springproject.domain.User;


import javax.persistence.Lob;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class CartCommand {

    @NotBlank
    public Long Id;

    @Min(0)
    @Max(100000000000L)
    public Long payable;

    @NotNull
    @Lob
    public String description;

    @DateTimeFormat
    public Date registerDate;
    @NotBlank
    public User registerId;
    public Set<CartItem> cartItems =new HashSet<>();

}
