package kdmpopulationtracker.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kdmpopulationtracker.model.SunCharacter;
import kdmpopulationtracker.repository.SunCharacterRepository;

@RestController
public class SunCharacterController {

	@RequestMapping("/Sun/Characters")
	public Collection<SunCharacter> getAllCharacters() {
		return SunCharacterRepository.getRepoInstance().getCharacterMap().values();
	}

}
