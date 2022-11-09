package Kodlama.io.progWithsub.business.abstracts;

import java.util.List;

import Kodlama.io.progWithsub.business.requests.CreateLanguageRequest;
import Kodlama.io.progWithsub.business.requests.CreateSubTechnologyRequest;
import Kodlama.io.progWithsub.business.requests.DeleteSubTechnologyRequest;
import Kodlama.io.progWithsub.business.requests.UpdateSubTechnologyRequest;
import Kodlama.io.progWithsub.business.responses.GetAllSubTechnologyResponses;

public interface SubTechnologyService {
	List<GetAllSubTechnologyResponses> getAll();
	void delete(DeleteSubTechnologyRequest deletePlanguageRequest );
	void update(int id, UpdateSubTechnologyRequest subTechnologyRequest );
	void add(CreateSubTechnologyRequest createLanguageRequest);
}
