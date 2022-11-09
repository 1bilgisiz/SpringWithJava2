package Kodlama.io.progWithsub.entities.concrets;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="language")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class PLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ıd")
	private int id;
	
	
	@Column(name="name")
	private String name;

	
	
	 @OneToMany(mappedBy = "subid")
    private List<SubTechnology> subTechnologies;
	 
	
}
