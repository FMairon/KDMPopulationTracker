package kdmpopulationtracker.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import kdmpopulationtracker.enumeration.CourageAbility;
import kdmpopulationtracker.enumeration.Gender;
import kdmpopulationtracker.enumeration.UnderstandingAbility;
import kdmpopulationtracker.enumeration.WeaponProficiency;

public class BaseCharacter extends KDMCharacter {

	private CourageAbility courageAbility;

	private UnderstandingAbility understandingability;

	public BaseCharacter(UUID settlementUuid, String firstname, String lastname, Gender gender, int survival,
			int huntXP, WeaponProficiency weaponProficiency, int weaponProficiencyLevel, Map<String, Integer> stats,
			int courage, int understanding, List<String> fightingArts, List<String> disorders,
			List<String> abilitiesAndImparements, CourageAbility courageAbility,
			UnderstandingAbility understandingability) {
		super(settlementUuid, firstname, lastname, gender, survival, huntXP, weaponProficiency, weaponProficiencyLevel,
				stats, courage, understanding, fightingArts, disorders, abilitiesAndImparements);
		this.courageAbility = courageAbility;
		this.understandingability = understandingability;
	}

	public BaseCharacter() {
		super();
		this.courageAbility = CourageAbility.NONE;
		this.understandingability = UnderstandingAbility.NONE;
	}

	public CourageAbility getCourageAbility() {
		return courageAbility;
	}

	public void setCourageAbility(CourageAbility courageAbility) {
		this.courageAbility = courageAbility;
	}

	public UnderstandingAbility getUnderstandingability() {
		return understandingability;
	}

	public void setUnderstandingability(UnderstandingAbility understandingability) {
		this.understandingability = understandingability;
	}

}
