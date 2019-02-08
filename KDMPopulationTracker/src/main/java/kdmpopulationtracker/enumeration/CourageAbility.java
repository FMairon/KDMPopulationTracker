package kdmpopulationtracker.enumeration;

public enum CourageAbility {

	STALWARD("Stalward", "Can't be knocked down by brain trauma or intimidate."),
	PREPARED("Prepared", "Add your HuntXP to your roll when determining a straggler."),
	MATCHMAKER("Matchmaker", "Spend 1 endeavor to trigger the intimacy story event."), NONE("None", "None");

	private String name;

	private String description;

	private CourageAbility(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
