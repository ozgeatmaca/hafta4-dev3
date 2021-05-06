package hafta4ödev3;

public class GamerManager implements GamerService {
	
	IdentityManager identityManager; 
	
    public GamerManager(IdentityManager identityManager) {
		super();
		this.identityManager = identityManager;
	}

	
    public void add(Gamer gamer) {
		identityManager.control(gamer);
        System.out.println(gamer.getFirstName() + " adlý kullanýcý eklendi.");
    }

    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adlý kullanýcý güncellendi.");
    }

 
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adlý kullanýcý silindi.");
    }
}
