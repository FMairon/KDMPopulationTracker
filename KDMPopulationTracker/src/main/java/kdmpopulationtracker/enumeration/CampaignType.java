package kdmpopulationtracker.enumeration;

public enum CampaignType {

	BASE("1.5"), STARS("People of the Stars"), SUN("People of the Sun");

	private String campaignText;

	public String getCampaignText() {
		return campaignText;
	}

	public void setCampaignText(String campaignText) {
		this.campaignText = campaignText;
	}

	private CampaignType(String campaignText) {
		this.campaignText = campaignText;
	}

}
