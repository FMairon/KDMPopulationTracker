package kdmpopulationtracker.enumeration;

public enum WeaponProficiency {

	GRAND("Grand Weapon"), AXE("Axe"), BOW("Bow"), CLUB("Club"), DAGGER("Dagger"), FISTANDTOOTH("Fist and Tooth"),
	KATANA("Katana"), KATAR("Katar"), SHIELD("Shield"), SPEAR("Spear"), SWORD("Sword"), WHIP("Whip"),
	TWIGHLIGHTSWORD("Twilight Sword"), SCYTHE("Scythe"), NONE("None");

	private String weaponProficiencyText;

	private WeaponProficiency(String weaponProficiencyText) {
		this.weaponProficiencyText = weaponProficiencyText;
	}

	public String getWeaponProficiencyText() {
		return weaponProficiencyText;
	}

	public void setWeaponProficiencyText(String weaponProficiencyText) {
		this.weaponProficiencyText = weaponProficiencyText;
	}

}
