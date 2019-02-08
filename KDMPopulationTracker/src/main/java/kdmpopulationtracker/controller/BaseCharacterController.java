package kdmpopulationtracker.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerationException;

import kdmpopulationtracker.model.BaseCharacter;
import kdmpopulationtracker.repository.BaseCharacterRepository;

@RestController
public class BaseCharacterController {

	private BaseCharacterRepository repoInstance;

	private void initRepo() {
		if (this.repoInstance == null) {
			repoInstance = BaseCharacterRepository.getRepoInstance();
		}
	}

	@RequestMapping("/Base/Characters")
	public Collection<BaseCharacter> getCharactersBySettlementUuid(
			@RequestParam(value = "SettlementUuid", required = false) UUID settlementUuid) {
		initRepo();
		if (settlementUuid == null) {
			return repoInstance.getCharacterMap().values();
		} else {
			return repoInstance.getCharactersBySettlementUuid(settlementUuid);
		}
	}

	@RequestMapping(value = "/Base/Characters", method = RequestMethod.POST)
	public BaseCharacter createNewCharacters(@RequestBody BaseCharacter character)
			throws JsonGenerationException, IOException {
		initRepo();
		repoInstance.addCharacter(character);
		return character;
	}

}
