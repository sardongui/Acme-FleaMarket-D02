package acme.features.administrator.dashboard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.forms.Dashboard;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractShowService;

@Service
public class AdministratorDashboardShow implements AbstractShowService<Administrator, Dashboard>{

	@Autowired
	AdministratorDashboardRepository repository;


	@Override
	public boolean authorise(final Request<Dashboard> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Dashboard> request, final Dashboard entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "numberNews", "numberMaterialSheets", "numberToolSheets", "numberSuggestions", "numberFigments", "minDiscountAdvertisements", "maxDiscountAdvertisements", "averageDiscountAdvertisements",
			"stddevDiscountAdvertisements");
	}


	@Override
	public Dashboard findOne(Request<Dashboard> request) {

		assert request != null;

		Dashboard res = new Dashboard();

		Integer numNews = this.repository.numberNews();
		res.setNumberNews(numNews);
		Integer numMaterialSheets = this.repository.numberMaterialSheets();
		res.setNumberMaterialSheets(numMaterialSheets);
		Integer numberToolSheets = this.repository.numberToolSheets();
		res.setNumberToolSheets(numberToolSheets);
		Integer numberSuggestions = this.repository.numberSuggestions();
		res.setNumberSuggestions(numberSuggestions);
		Integer numberFigments = this.repository.numberFigments();
		res.setNumberFigments(numberFigments);
		Double minDiscountAdvertisements = this.repository.minDiscountAdvertisements();
		res.setMinDiscountAdvertisements(minDiscountAdvertisements);
		Double maxDiscountAdvertisements = this.repository.maxDiscountAdvertisements();
		res.setMaxDiscountAdvertisements(maxDiscountAdvertisements);
		Double averageDiscountAdvertisements = this.repository.averageDiscountAdvertisements();
		res.setAverageDiscountAdvertisements(averageDiscountAdvertisements);
		//STDDEV INQUIRIE
		Collection<Advertisement> stddevDiscountAdvertisements = this.repository.stddevDiscountAdvertisements();
		List<Advertisement> advertisement = (List<Advertisement>) stddevDiscountAdvertisements;
		List<Double> maxAndMinAdv = new ArrayList<Double>();
		for (int i = 0; i < stddevDiscountAdvertisements.size(); i++) {
			maxAndMinAdv.add(advertisement.get(i).getMinMoney().getAmount());
			maxAndMinAdv.add(advertisement.get(i).getMaxMoney().getAmount());
		}
		Double stddevInq = AdministratorDashboardShow.stdev(maxAndMinAdv, stddevDiscountAdvertisements);
		res.stddevDiscountAdvertisements(stddevDiscountAdvertisements);
		
		return res;
	}

	public static double stdev(final List<Double> list, final Double mean) {
		double num = 0.0;
		double numi = 0.0;
		for (Double i : list) {
			numi = Math.pow(i - mean, 2);
			num += numi;
		}
		return Math.sqrt(num / list.size());
	}

}
