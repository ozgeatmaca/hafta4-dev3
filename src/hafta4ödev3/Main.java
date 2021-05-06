package hafta4ödev3;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(2, "Özge", "3247938484");
        Game game1 = new Game(1, "Sims 4", 200);
        Campaign campaign1 = new Campaign(3,"%85 indirim kampanyası",85);
        GamerManager gamerManager = new GamerManager(new IdentityManager());
        GameManager gameManager = new GameManager(new CampaignManager() );
        gamerManager.add(gamer1);
        System.out.println("indirimsiz fiyat");
        gameManager.sell(gamer1, game1);
        
        System.out.println("indirimli fiyat");
        gameManager.sellCampaign(gamer1, game1,campaign1);

	}

}
