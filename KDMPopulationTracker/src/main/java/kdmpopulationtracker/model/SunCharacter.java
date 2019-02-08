package kdmpopulationtracker.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import kdmpopulationtracker.enumeration.Gender;
import kdmpopulationtracker.enumeration.WeaponProficiency;

public class SunCharacter extends KDMCharacter {
	private boolean purified;

	private boolean sunEater;

	private boolean childOfTheSun;

	public SunCharacter(UUID settlementUuid, String firstname, String lastname, Gender gender, int survival, int huntXP,
			WeaponProficiency weaponProficiency, int weaponProficiencyLevel, Map<String, Integer> stats, int courage,
			int understanding, List<String> fightingArts, List<String> disorders, List<String> abilitiesAndImparements,
			boolean purified, boolean sunEater, boolean childOfTheSun) {
		super(settlementUuid, firstname, lastname, gender, survival, huntXP, weaponProficiency, weaponProficiencyLevel,
				stats, courage, understanding, fightingArts, disorders, abilitiesAndImparements);
		this.purified = purified;
		this.sunEater = sunEater;
		this.childOfTheSun = childOfTheSun;
	}

	public SunCharacter() {
		super();
		this.childOfTheSun = false;
		this.purified = false;
		this.sunEater = false;
	}

	public boolean isPurified() {
		return purified;
	}

	public void setPurified(boolean purified) {
		this.purified = purified;
	}

	public boolean isSunEater() {
		return sunEater;
	}

	public void setSunEater(boolean sunEater) {
		this.sunEater = sunEater;
	}

	public boolean isChildOfTheSun() {
		return childOfTheSun;
	}

	public void setChildOfTheSun(boolean childOfTheSun) {
		this.childOfTheSun = childOfTheSun;
	}
}
