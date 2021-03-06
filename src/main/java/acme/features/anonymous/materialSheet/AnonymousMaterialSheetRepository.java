
package acme.features.anonymous.materialSheet;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.materialSheets.MaterialSheet;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousMaterialSheetRepository extends AbstractRepository {

	@Query("Select m from MaterialSheet m group by m.providerName")
	Collection<MaterialSheet> findMany();

	@Query("select m from MaterialSheet m where m.id =?1")
	MaterialSheet findOneById(int id);

}
