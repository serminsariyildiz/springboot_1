//Deneme

package kodlamaio.nortwind.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table

public class Sermin {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
}
