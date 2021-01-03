package springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipe_app.domain.UnitOfMeasure;

import javax.persistence.criteria.CriteriaDelete;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
