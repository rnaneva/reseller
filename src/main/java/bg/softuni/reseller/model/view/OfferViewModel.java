package bg.softuni.reseller.model.view;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BoughtItemView {

    private long id;
    private BigDecimal price;
    private String description;
}
