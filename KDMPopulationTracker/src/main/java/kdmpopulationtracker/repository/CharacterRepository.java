package kdmpopulationtracker.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import kdmpopulationtracker.model.KDMCharacter;

public abstract class CharacterRepository<T extends KDMCharacter> {

	protected ObjectReader reader;

	private final String FILE_PATH;

	private ObjectMapper objectMapper;

	private Map<UUID, T> characterMap;

	protected CharacterRepository(String filePath) {
		this.FILE_PATH = filePath;
	}

	protected void loadData() throws JsonProcessingException, IOException {
		JsonNode node = objectMapper.readTree(new File(FILE_PATH));
		if (node != null) {
			List<T> characterList = reader.readValue(node);
			fillCharacterMap(characterList);
		} else {
			characterMap = new HashMap<UUID, T>();
		}
	}

	private void fillCharacterMap(List<T> characterList) {
		characterMap = new HashMap<UUID, T>();
		for (T character : characterList) {
			characterMap.put(character.getUuid(), character);
		}
	}

	public Collection<T> getAllCharacters() {
		return getCharacterMap().values();
	}

	public Collection<T> getCharactersBySettlementUuid(UUID settlementUuid) {
		Collection<T> characters = getCharacterMap().values();
		Collection<T> settlementCharacters = new ArrayList<T>();
		for (T character : characters) {
			if (character.getSettlementUUID() == settlementUuid) {
				settlementCharacters.add(character);
			}
		}
		return settlementCharacters;
	}

	private void saveData() throws JsonGenerationException, IOException {
		objectMapper.writeValue(new File(FILE_PATH), characterMap.values());
	}

	public void addCharacter(T character) throws JsonGenerationException, IOException {
		characterMap.put(character.getUuid(), character);
		saveData();
	}

	public void updateCharacter(UUID uuid, T character) throws JsonGenerationException, IOException {
		characterMap.replace(uuid, character);
		saveData();
	}

	public void removeCharacter(UUID uuid, T character) throws JsonGenerationException, IOException {
		characterMap.remove(uuid);
		saveData();
	}

	public String getFILE_PATH() {
		return FILE_PATH;
	}

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}

	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public void setObjectReader(ObjectReader reader) {
		this.reader = reader;
	}

	public Map<UUID, T> getCharacterMap() {
		return characterMap;
	}
}