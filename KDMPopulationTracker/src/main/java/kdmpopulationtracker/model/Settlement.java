package kdmpopulationtracker.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import kdmpopulationtracker.enumeration.CampaignType;

public class Settlement {

	private UUID uuid;

	private String name;

	private CampaignType campaignType;

	private List<KDMCharacter> characterList;

	private List<Bonus> bonusList;

	public Settlement(UUID uuid, String name, CampaignType campaignType) {
		super();
		this.campaignType = campaignType;
		this.uuid = uuid;
		this.name = name;
		this.bonusList = new ArrayList<Bonus>();
		this.characterList = new ArrayList<KDMCharacter>();
	}

	public CampaignType getCampaignType() {
		return campaignType;
	}

	public void setCampaignType(CampaignType campaignType) {
		this.campaignType = campaignType;
	}

	public List<KDMCharacter> getCharacterList() {
		return characterList;
	}

	public void setCharacterList(List<KDMCharacter> characterList) {
		this.characterList = characterList;
	}

	public List<Bonus> getBonusList() {
		return bonusList;
	}

	public void setBonusList(List<Bonus> bonusList) {
		this.bonusList = bonusList;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
