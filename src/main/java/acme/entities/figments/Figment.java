package acme.entities.figments;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Figment extends DomainEntity{
	
	private static final long	serialVersionUID	= 1L;
	

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationMoment;
	
	@NotBlank
	private String				nameInventor;
	
	@NotBlank
	private String				text;
	
	@NotBlank
	private Double				price;
}