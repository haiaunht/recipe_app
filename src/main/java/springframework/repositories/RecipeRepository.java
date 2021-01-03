package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe_app.domain.Recipe;


public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
