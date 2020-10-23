package acme.entities.advertisements;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Advertisement extends DomainEntity{
	
	private static final long	serialVersionUID	= 1L;
	

	@NotBlank
	private String				title;

	@NotBlank
	private String				picture;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationMoment;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date				displayPeriod;
	
	@NotBlank
	private String				text;
	
	@NotBlank
	private String				discounts;

}
