package Kodlama.io.progWithsub.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.progWithsub.business.abstracts.PlanguageService;
import Kodlama.io.progWithsub.business.requests.CreateLanguageRequest;
import Kodlama.io.progWithsub.business.requests.DeletePlanguageRequest;
import Kodlama.io.progWithsub.business.requests.UpdatePlanguageRequest;
import Kodlama.io.progWithsub.business.responses.GetAllLanguageResponses;
import Kodlama.io.progWithsub.business.responses.GetByIdlanguageResponses;
import Kodlama.io.progWithsub.entities.concrets.PLanguage;

@RestController
@RequestMapping("/api/language")

public class PlanguageControllers {
	private PlanguageService planguageService;

	
	@Autowired
	public PlanguageControllers(PlanguageService planguageService) {

		this.planguageService = planguageService;
	}
	
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponses> getall(){
		return planguageService.getAll();
		
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.planguageService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeletePlanguageRequest deletePlanguageRequest) {
		this.planguageService.delete(deletePlanguageRequest);
		
	}
	@PutMapping("/update")
	public void update(int id,UpdatePlanguageRequest planguageRequest) {
		this.planguageService.update(id, planguageRequest);
		
	}
	@GetMapping("{Id}")
	public GetByIdlanguageResponses getById(int id){
        return planguageService.getById(id);
    }

}
