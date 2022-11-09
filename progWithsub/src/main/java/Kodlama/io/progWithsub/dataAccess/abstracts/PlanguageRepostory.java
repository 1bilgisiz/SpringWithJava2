package Kodlama.io.progWithsub.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.progWithsub.entities.concrets.PLanguage;


public interface PlanguageRepostory extends JpaRepository<PLanguage, Integer> {
	


}
