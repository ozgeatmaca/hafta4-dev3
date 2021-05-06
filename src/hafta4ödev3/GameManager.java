package hafta4ödev3;

public class GameManager implements GameService {
	
	CampaignManager campaignManager;
    public GameManager(CampaignManager campaignManager) {
		super();
		this.campaignManager = campaignManager;
	}
	@Override
    public void sell(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " adlý kullanýcý " + game.getGameName() + " oyununa " + game.getUnitPrice() + " ücret verdi..");
    }
	@Override
    public void sellCampaign(Gamer gamer, Game game,Campaign campaign) {
        System.out.println(gamer.getFirstName() + "  adlý kullanýcý " + game.getGameName() + " oyununa " + campaign.getCampaignName()+ " kampanyasý ile "+ campaign.getCampaignPrice() + " ücret verdi.");
    }
}

