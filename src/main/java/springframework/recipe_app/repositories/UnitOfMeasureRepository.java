package springframework.recipe_app.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe_app.domain.UnitOfMeasure;

import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
