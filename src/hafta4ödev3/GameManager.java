package hafta4�dev3;

public class GameManager implements GameService {
	
	CampaignManager campaignManager;
    public GameManager(CampaignManager campaignManager) {
		super();
		this.campaignManager = campaignManager;
	}
	@Override
    public void sell(Gamer gamer, Game game) {
        System.out.println(gamer.getFirstName() + " adl� kullan�c� " + game.getGameName() + " oyununa " + game.getUnitPrice() + " �cret verdi..");
    }
	@Override
    public void sellCampaign(Gamer gamer, Game game,Campaign campaign) {
        System.out.println(gamer.getFirstName() + "  adl� kullan�c� " + game.getGameName() + " oyununa " + campaign.getCampaignName()+ " kampanyas� ile "+ campaign.getCampaignPrice() + " �cret verdi.");
    }
}

