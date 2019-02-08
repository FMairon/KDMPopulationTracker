package kdmpopulationtracker.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import kdmpopulationtracker.enumeration.Constellation;
import kdmpopulationtracker.enumeration.Gender;
import kdmpopulationtracker.enumeration.WeaponProficiency;

public class StarsCharacter extends KDMCharacter {

	private Constellation constellation;

	public StarsCharacter(UUID settlementUuid, String firstname, String lastname, Gender gender, int survival,
			int huntXP, WeaponProficiency weaponProficiency, int weaponProficiencyLevel, Map<String, Integer> stats,
			int courage, int understanding, List<String> fightingArts, List<String> disorders,
			List<String> abilitiesAndImparements, Constellation constellation) {
		super(settlementUuid, firstname, lastname, gender, survival, huntXP, weaponProficiency, weaponProficiencyLevel,
				stats, courage, understanding, fightingArts, disorders, abilitiesAndImparements);
		this.constellation = constellation;
	}

	public StarsCharacter() {
		super();
		this.constellation = Constellation.NONE;
	}

	public Constellation getConstellation() {
		return constellation;
	}

	public void setConstellation(Constellation constellation) {
		this.constellation = constellation;
	}

}
