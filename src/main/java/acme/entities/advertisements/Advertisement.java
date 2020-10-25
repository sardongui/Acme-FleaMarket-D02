package acme.entities.advertisements;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

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
	
	//@NotEmpty
	//private String				discounts;
	
	@NotEmpty
	private String smallDiscount;
	
	@NotEmpty
	private String averageDiscount;
	
	@NotEmpty
	private String largeDiscount;
	

}
