package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois =  new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois]=gaulois;
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void setChef(Chef chef) {
		
	}
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
// Gaulois gaulois = village.trouverHabitant(30); --> erreur:Index 30 out of bounds for length 30
		Chef chef = new Chef("Abraracoursix", 6, village);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
//Gaulois gaulois = village.trouverHabitant(1);
//System.out.println(gaulois); null
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(chef);
		
		
	}
	
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans village du chef Abraracourcix vivent les légendaires gaulois:");
		for (int i=0; i<nbVillageois;i++) {
			System.out.println(villageois[i].getNom());
			
		}
		
	}
	
}


