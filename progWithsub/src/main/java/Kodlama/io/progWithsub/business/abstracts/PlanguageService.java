package Kodlama.io.progWithsub.business.abstracts;

import java.util.List;

import Kodlama.io.progWithsub.business.requests.CreateLanguageRequest;
import Kodlama.io.progWithsub.business.requests.DeletePlanguageRequest;
import Kodlama.io.progWithsub.business.requests.UpdatePlanguageRequest;
import Kodlama.io.progWithsub.business.responses.GetAllLanguageResponses;
import Kodlama.io.progWithsub.business.responses.GetByIdlanguageResponses;

public interface PlanguageService {
	List<GetAllLanguageResponses> getAll();
	void add(CreateLanguageRequest createLanguageRequest);
	void delete(DeletePlanguageRequest deletePlanguageRequest);
	void update(int id, UpdatePlanguageRequest planguageRequest);
	
	GetByIdlanguageResponses getById(int id);
	
}
