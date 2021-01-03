package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe_app.domain.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
