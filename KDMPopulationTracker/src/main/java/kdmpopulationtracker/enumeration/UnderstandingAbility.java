package kdmpopulationtracker.enumeration;

public enum UnderstandingAbility {

	ANALYZE("Analyze", "Look at the top AI card and return it to the top of the deck."),
	EXPLORE("Explore", "Add +2 to your investigation rolls."),
	TINKER("Tinker", "+1 Endeavor when you are a returning survivor."), NONE("None", "None");

	private String name;

	private String text;

	private UnderstandingAbility(String name, String text) {
		this.name = name;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
