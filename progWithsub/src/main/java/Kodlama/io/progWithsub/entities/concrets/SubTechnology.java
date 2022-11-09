package Kodlama.io.progWithsub.entities.concrets;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="subtechnology")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class SubTechnology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="subid")
	private int subid;
	
	@Column(name="subName")
	private String subName;
	

	@ManyToOne
	@JoinColumn(name="ıd")
	private SubTechnology subTechnology;
	
}
