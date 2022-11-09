package Kodlama.io.progWithsub.business.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.progWithsub.business.abstracts.SubTechnologyService;
import Kodlama.io.progWithsub.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.progWithsub.business.requests.DeleteSubTechnologyRequest;
import Kodlama.io.progWithsub.business.requests.UpdateSubTechnologyRequest;
import Kodlama.io.progWithsub.business.responses.GetAllSubTechnologyResponses;
import Kodlama.io.progWithsub.dataAccess.abstracts.SubTechnologyRepostory;
import Kodlama.io.progWithsub.entities.concrets.SubTechnology;


@Service
public class SubTechnologyManager implements SubTechnologyService {

	private SubTechnologyRepostory subTechnologyRepostory;
	
	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepostory subTechnologyRepostory) {
		this.subTechnologyRepostory = subTechnologyRepostory;
	}



	@Override
	public List<GetAllSubTechnologyResponses> getAll() {
		List<SubTechnology> subTechnologies = subTechnologyRepostory.findAll();
		List<GetAllSubTechnologyResponses> allSubTechnologyResponses =  new ArrayList<GetAllSubTechnologyResponses>();
		
		
		for (SubTechnology subTechnology : subTechnologies) {
			GetAllSubTechnologyResponses responseItem = new GetAllSubTechnologyResponses();
			responseItem.setSubId(subTechnology.getSubid());
			responseItem.setSubName(subTechnology.getSubName());
			
			allSubTechnologyResponses.add(responseItem);
			
		}
		
		
		
		return allSubTechnologyResponses;
		
	}



	@Override
	public void add(CreateSubTechnologyRequest createLanguageRequest) {

		SubTechnology subTechnology = new SubTechnology();
		subTechnology.setSubName(createLanguageRequest.getSubName());
		
		this.subTechnologyRepostory.save(subTechnology);
	}



	@Override
	public void delete(DeleteSubTechnologyRequest deletePlanguageRequest) {
		subTechnologyRepostory.deleteById(deletePlanguageRequest.getId());
		
	}



	@Override
	public void update(int id, UpdateSubTechnologyRequest subTechnologyRequest) {
	 
		SubTechnology subTechnology = subTechnologyRepostory.findById(id).get();
		SubTechnology subTechnology2 = subTechnologyRepostory.findById(subTechnologyRequest.getId()).get();
		subTechnology.setSubName(subTechnologyRequest.getSubName());
		subTechnology.setSubid(id);
		subTechnologyRepostory.save(subTechnology);
		
	}

}
