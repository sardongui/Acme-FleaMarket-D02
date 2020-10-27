package acme.entities.advertisements;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Advertisement extends DomainEntity{
	
	private static final long	serialVersionUID	= 1L;
	

	@NotEmpty
	private String				title;

	@URL
	@NotEmpty
	private String				picture;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	@NotNull
	private Date				creationMoment;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date				displayPeriod;
	
	@NotEmpty
	private String				text;
	
	@NotEmpty
	@Pattern(regexp = "^(small|average|large)$")
	private String				discounts;
//	
//	@NotEmpty
//	@Range(min = 2, max = 3)
//	private Double smallDiscount;
//	
//	@NotEmpty
//	@Range(min = 4, max = 5)
//	private Double averageDiscount;
//	
//	@NotEmpty
//	@Range(min = 6)
//	private Double largeDiscount;
	

}
