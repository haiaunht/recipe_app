package springframework.recipe_app.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springframework.recipe_app.domain.UnitOfMeasure;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long id;
    private Long recipeId;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;

}
