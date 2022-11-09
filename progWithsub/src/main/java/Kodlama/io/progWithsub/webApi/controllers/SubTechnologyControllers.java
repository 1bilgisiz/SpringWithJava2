package Kodlama.io.progWithsub.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.progWithsub.business.abstracts.SubTechnologyService;
import Kodlama.io.progWithsub.business.requests.CreateLanguageRequest;
import Kodlama.io.progWithsub.business.requests.DeleteSubTechnologyRequest;
import Kodlama.io.progWithsub.business.requests.UpdateSubTechnologyRequest;
import Kodlama.io.progWithsub.business.responses.GetAllSubTechnologyResponses;

@RestController
@RequestMapping("/api/subtechnology")
public class SubTechnologyControllers {
	
	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologyControllers(SubTechnologyService subTechnologyService) {
		this.subTechnologyService = subTechnologyService;
	}
	
	
	@GetMapping("/getall")

	public List<GetAllSubTechnologyResponses> getall(){
		return subTechnologyService.getAll();
		
	}
	@PostMapping
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.subTechnologyService.add(createLanguageRequest);
	}
	
	
	@DeleteMapping("/delete")
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
		this.subTechnologyService.delete(deleteSubTechnologyRequest);
		
	}
	@PutMapping("/update")
	public void  update(int id, UpdateSubTechnologyRequest subTechnologyRequest) {
		this.subTechnologyService.update(id, subTechnologyRequest);
	}
	
	

}
