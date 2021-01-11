package springframework.recipe_app.services;

import springframework.recipe_app.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
