package acme.features.administrator.dashboard;



import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository{

	@Query("select count(n) from New n")
	Integer numberNews();
	
	@Query("select count(m) from MaterialSheet m")
	Integer numberMaterialSheets();
	
	@Query("select count(t) from ToolSheet t")
	Integer numberToolSheets();
	
	@Query("select count(s) from Suggestion s")
	Integer numberSuggestions();
	
	@Query("select count(f) from Figment f")
	Integer numberFigments();
//	
//	@Query("select min (a.discounts) from Advertisement a")
//	Double minDiscountAdvertisements();
//
//	@Query("select max count(a.discounts) from Advertisement a")
//	Double maxDiscountAdvertisements();

	//@Query("select avg ((max_money_amount + min_money_amount)/2) from Advertisement a group by a.discounts")
	//Double averageDiscountAdvertisements();

	//@Query("select a from Advertisement a")
	//Collection<Advertisement> stddevDiscountAdvertisements();
}
