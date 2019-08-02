
public class Main {

	public static void main(String[] args) 
	{
		Chien c = new Chien("Gris bleuté", 20);
		c.boire();
		c.manger();
		c.deplacement();
		c.crier();
		System.out.println(c.toString());
		
		System.out.println("------------------------------------------");
		
		c.faireLeBeau();
		c.faireLechouille();
		c.faireCalin();
		
		System.out.println("-------------------------------------------");
		
		Rintintin r = new Chien();
		r.faireLeBeau();
		r.faireCalin();
		r.faireLechouille();
	}

}
