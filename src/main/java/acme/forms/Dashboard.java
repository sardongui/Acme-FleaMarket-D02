package acme.forms;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable{
	
	private static final long	serialVersionUID	= 1L;

	Integer						numberNews;

	Integer						numberMaterialSheets;

	Integer						numberToolSheets;
	
	Integer						numberSuggestions;
	
	Integer						numberFigments;

	Double						minDiscountAdvertisements;

	Double						maxDiscountAdvertisements;

	Double						averageDiscountAdvertisements;

	Double						stddevDiscountAdvertisements;

}
