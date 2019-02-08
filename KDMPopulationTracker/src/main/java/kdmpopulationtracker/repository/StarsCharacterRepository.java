package kdmpopulationtracker.repository;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import kdmpopulationtracker.model.StarsCharacter;

public class StarsCharacterRepository extends CharacterRepository<StarsCharacter> {

	private static StarsCharacterRepository repoInstance;

	public StarsCharacterRepository(String filePath) {
		super(filePath);
	}

	public static void initializeRepo() throws JsonProcessingException, IOException {
		if (repoInstance == null) {
			repoInstance = new StarsCharacterRepository("c:\\dev\\kdmpopulationtracker\\data\\stars-characters.json");
			repoInstance.setObjectMapper(new ObjectMapper());
			repoInstance.setObjectReader(
					repoInstance.getObjectMapper().readerFor(new TypeReference<List<StarsCharacter>>() {
					}));
			repoInstance.loadData();
		}
	}

	public static StarsCharacterRepository getRepoInstance() {
		return repoInstance;
	}

}
