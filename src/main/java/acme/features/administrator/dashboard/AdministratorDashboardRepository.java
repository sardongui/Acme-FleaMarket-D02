package acme.features.administrator.dashboard;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository{

	@Query("select count(n) from News n")
	Integer numberNews();
	
	@Query("select count(m) from MaterialSheet m")
	Integer numberMaterialSheets();
	
	@Query("select count(t) from ToolSheet t")
	Integer numberToolSheets();
	
	@Query("select count(s) from Suggestion s")
	Integer numberSuggestions();
	
	@Query("select count(f) from Figment f")
	Integer numberFigments();
	
	@Query("select min (minMoney.amount) from Advertisement where endDate>CURRENT_TIMESTAMP")
	Double minDiscountAdvertisements();

	@Query("select max (maxMoney.amount) from Advertisement where endDate>CURRENT_TIMESTAMP")
	Double maxDiscountAdvertisements();

	@Query("select avg ((max_money_amount + min_money_amount)/2) from Advertisement where endDate>CURRENT_TIMESTAMP")
	Double averageDiscountAdvertisements();

	@Query("select a from Advertisement a where endDate>CURRENT_TIMESTAMP")
	Collection<Advertisement> stddevDiscountAdvertisements();
}
