package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import springframework.recipe_app.domain.UnitOfMeasure;

import javax.persistence.criteria.CriteriaDelete;
import java.util.Optional;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
