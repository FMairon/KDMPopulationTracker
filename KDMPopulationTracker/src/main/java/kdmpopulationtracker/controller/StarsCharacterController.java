package kdmpopulationtracker.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kdmpopulationtracker.model.StarsCharacter;
import kdmpopulationtracker.repository.StarsCharacterRepository;

@RestController
public class StarsCharacterController {

	@RequestMapping("/Stars/Characters")
	public Collection<StarsCharacter> getAllCharacters() {
		return StarsCharacterRepository.getRepoInstance().getCharacterMap().values();
	}

}
