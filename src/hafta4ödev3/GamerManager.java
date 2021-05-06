package hafta4�dev3;

public class GamerManager implements GamerService {
	
	IdentityManager identityManager; 
	
    public GamerManager(IdentityManager identityManager) {
		super();
		this.identityManager = identityManager;
	}

	
    public void add(Gamer gamer) {
		identityManager.control(gamer);
        System.out.println(gamer.getFirstName() + " adl� kullan�c� eklendi.");
    }

    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adl� kullan�c� g�ncellendi.");
    }

 
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + " adl� kullan�c� silindi.");
    }
}
