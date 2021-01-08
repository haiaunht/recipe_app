package springframework.recipe_app.services;

import springframework.recipe_app.commands.RecipeCommand;
import springframework.recipe_app.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
