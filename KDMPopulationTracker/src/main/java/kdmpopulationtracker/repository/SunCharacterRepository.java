package kdmpopulationtracker.repository;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import kdmpopulationtracker.model.SunCharacter;

public class SunCharacterRepository extends CharacterRepository<SunCharacter> {

	private static SunCharacterRepository repoInstance;

	public SunCharacterRepository(String filePath) {
		super(filePath);
	}

	public static void initializeRepo() throws JsonProcessingException, IOException {
		if (repoInstance == null) {
			repoInstance = new SunCharacterRepository("c:\\dev\\kdmpopulationtracker\\data\\sun-characters.json");
			repoInstance.setObjectMapper(new ObjectMapper());
			repoInstance
					.setObjectReader(repoInstance.getObjectMapper().readerFor(new TypeReference<List<SunCharacter>>() {
					}));
			repoInstance.loadData();
		}
	}

	public static SunCharacterRepository getRepoInstance() {
		return repoInstance;
	}

}
