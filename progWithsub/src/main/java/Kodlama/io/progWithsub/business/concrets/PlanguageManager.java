package Kodlama.io.progWithsub.business.concrets;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.progWithsub.business.abstracts.PlanguageService;
import Kodlama.io.progWithsub.business.requests.CreateLanguageRequest;
import Kodlama.io.progWithsub.business.requests.DeletePlanguageRequest;
import Kodlama.io.progWithsub.business.requests.UpdatePlanguageRequest;
import Kodlama.io.progWithsub.business.responses.GetAllLanguageResponses;
import Kodlama.io.progWithsub.business.responses.GetByIdlanguageResponses;
import Kodlama.io.progWithsub.dataAccess.abstracts.PlanguageRepostory;
import Kodlama.io.progWithsub.entities.concrets.PLanguage;

@Service
public class PlanguageManager implements PlanguageService {

	private PlanguageRepostory planguageRepostory;

	@Autowired
	public PlanguageManager(PlanguageRepostory planguageRepostory) {
		this.planguageRepostory = planguageRepostory;
	}

	@Override
	public List<GetAllLanguageResponses> getAll() {
		List<PLanguage> languages = planguageRepostory.findAll();
		List<GetAllLanguageResponses> languageResponses = new ArrayList<GetAllLanguageResponses>();

		for (PLanguage language : languages) {
			GetAllLanguageResponses responsesItem = new GetAllLanguageResponses();
			responsesItem.setId(language.getId());
			responsesItem.setName(language.getName());

			languageResponses.add(responsesItem);

		}
		return languageResponses;

	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		PLanguage language = new PLanguage();
		language.setName(createLanguageRequest.getName());
		this.planguageRepostory.save(language);

	}

	@Override
	public void delete(DeletePlanguageRequest deletePlanguageRequest) {
		planguageRepostory.deleteById(deletePlanguageRequest.getId());

	}

	@Override
	public void update(int id, UpdatePlanguageRequest planguageRequest) {
		if (!planguageRequest.getName().isEmpty()) {
			PLanguage language = planguageRepostory.findById(id).get();
			language.setName(planguageRequest.getName());
			planguageRepostory.save(language);

		}

	}

	@Override
	public GetByIdlanguageResponses getById(int id) {
		PLanguage language = planguageRepostory.findById(id).get();
		GetByIdlanguageResponses response = new GetByIdlanguageResponses();
		response.setName(language.getName());
		return response;
	}

}
