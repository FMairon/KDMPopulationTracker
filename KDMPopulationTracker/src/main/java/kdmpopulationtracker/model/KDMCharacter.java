package kdmpopulationtracker.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import kdmpopulationtracker.enumeration.Gender;
import kdmpopulationtracker.enumeration.WeaponProficiency;

@JsonSubTypes({ @Type(value = BaseCharacter.class, name = "baseCharacter"),
		@Type(value = StarsCharacter.class, name = "starsCharacter"),
		@Type(value = SunCharacter.class, name = "sunCharacter") })
public abstract class KDMCharacter {

	protected UUID uuid;

	protected UUID settlementUUID;

	private String firstname;

	private String lastname;

	private Gender gender;

	private int survival;

	private int huntXP;

	private WeaponProficiency weaponProficiency;

	private int weaponProficiencyLevel;

	private Map<String, Integer> stats;

	private int courage;

	private int understanding;

	private List<String> fightingArts;

	private List<String> disorders;

	private List<String> abilitiesAndImparements;

	public KDMCharacter(UUID settlementUuid, String firstname, String lastname, Gender gender, int survival, int huntXP,
			WeaponProficiency weaponProficiency, int weaponProficiencyLevel, Map<String, Integer> stats, int courage,
			int understanding, List<String> fightingArts, List<String> disorders,
			List<String> abilitiesAndImparements) {
		super();
		this.uuid = UUID.randomUUID();
		this.setSettlementUUID(settlementUuid);
		this.firstname = firstname;
		this.abilitiesAndImparements = abilitiesAndImparements;
	}

	public KDMCharacter() {
		super();
		this.uuid = UUID.randomUUID();
		this.firstname = "";
		this.lastname = "";
		this.gender = Gender.UNKNOWN;
		this.survival = 0;
		this.huntXP = 0;
		this.weaponProficiency = WeaponProficiency.NONE;
		this.weaponProficiencyLevel = 0;
		initializeStats();
		this.courage = 0;
		this.understanding = 0;
		this.fightingArts = new ArrayList<String>();
		this.disorders = new ArrayList<String>();
		this.abilitiesAndImparements = new ArrayList<String>();
	}

	private void initializeStats() {
		stats = new HashMap<>();
		stats.put("movement", 5);
		stats.put("Accuracy", 0);
		stats.put("Strength", 0);
		stats.put("Evasion", 0);
		stats.put("Luck", 0);
		stats.put("Speed", 0);
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getSurvival() {
		return survival;
	}

	public void setSurvival(int survival) {
		this.survival = survival;
	}

	public int getHuntXP() {
		return huntXP;
	}

	public void setHuntXP(int huntXP) {
		if (huntXP < 16) {
			huntXP = 16;
		}
		this.huntXP = huntXP;
	}

	public WeaponProficiency getWeaponProficiency() {
		return weaponProficiency;
	}

	public void setWeaponProficiency(WeaponProficiency weaponProficiency) {
		this.weaponProficiency = weaponProficiency;
	}

	public int getWeaponProficiencyLevel() {
		return weaponProficiencyLevel;
	}

	public void setWeaponProficiencyLevel(int weaponProficiencyLevel) {
		if (weaponProficiencyLevel < 8) {
			weaponProficiencyLevel = 8;
		}
		this.weaponProficiencyLevel = weaponProficiencyLevel;
	}

	public Map<String, Integer> getStats() {
		return stats;
	}

	public void setMovement(int movement) {
		this.stats.replace("Movement", movement);
	}

	public void setAccuracy(int accuracy) {
		this.stats.replace("Accuracy", accuracy);
	}

	public void setStrength(int strength) {
		this.stats.replace("Strength", strength);
	}

	public void setEvasion(int evasion) {
		this.stats.replace("Evasion", evasion);
	}

	public void setLuck(int luck) {
		this.stats.replace("Luck", luck);
	}

	public void setSpeed(int speed) {
		this.stats.replace("Speed", speed);
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getUnderstanding() {
		return understanding;
	}

	public void setUnderstanding(int understanding) {
		this.understanding = understanding;
	}

	public List<String> getFightingArts() {
		return fightingArts;
	}

	public void setFightingArts(List<String> fightingArts) {
		this.fightingArts = fightingArts;
	}

	public List<String> getDisorders() {
		return disorders;
	}

	public void setDisorders(List<String> disorders) {
		this.disorders = disorders;
	}

	public List<String> getAbilitiesAndImparements() {
		return abilitiesAndImparements;
	}

	public void setAbilitiesAndImparements(List<String> abilitiesAndImparements) {
		this.abilitiesAndImparements = abilitiesAndImparements;
	}

	public UUID getSettlementUUID() {
		return settlementUUID;
	}

	public void setSettlementUUID(UUID settlementUUID) {
		this.settlementUUID = settlementUUID;
	}

}
