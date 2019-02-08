package kdmpopulationtracker.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import kdmpopulationtracker.model.BaseCharacter;

public class BaseCharacterRepository extends CharacterRepository<BaseCharacter> {

	private static BaseCharacterRepository repoInstance;

	public BaseCharacterRepository(String filePath) {
		super(filePath);
	}

	public static void initializeRepo() throws JsonProcessingException, IOException {
		if (repoInstance == null) {
			repoInstance = new BaseCharacterRepository("c:\\dev\\kdmpopulationtracker\\data\\base-characters.json");
			repoInstance.setObjectMapper(new ObjectMapper());
			repoInstance
					.setObjectReader(repoInstance.getObjectMapper().readerFor(new TypeReference<List<BaseCharacter>>() {
					}));
			repoInstance.loadData();
		}
	}

	public static BaseCharacterRepository getRepoInstance() {
		return repoInstance;
	}

	public Collection<BaseCharacter> getAllCharacters() {
		return getCharacterMap().values();
	}

	public Collection<BaseCharacter> getCharactersBySettlementUuid(UUID settlementUuid) {
		Collection<BaseCharacter> characters = getCharacterMap().values();
		Collection<BaseCharacter> settlementCharacters = new ArrayList<BaseCharacter>();
		for (BaseCharacter character : characters) {
			if (character.getSettlementUUID() == settlementUuid) {
				settlementCharacters.add(character);
			}
		}
		return settlementCharacters;
	}

}
