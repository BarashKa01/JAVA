public class Voiture 

{
	private Object carburant;
	private Object puissance;
	private static int cptajout;
	private Object nom;
	
	public Voiture()
	{
		this.carburant = "Carburant non indiqué";
		this.puissance = "moyenne";
		cptajout++;
		this.nom = "Voiture n°"+cptajout;
	}
	
	// METHODE D'INSTANCIATION
	
	public void setInfos()
	{
		
	}
	
	public toString()
	{
		
	}
	
	//SETTER
	
	public void setCarburant(Object carb)
	{
		this.carburant = carb;
	}
	
	public void setPuissance(Object Pui)
	{
		this.puissance = Pui;
	}
	
	public void setNom(Object nom)
	{
		this.nom = nom;
	}
	
	
	//GETTER
	
	public Object getCarburant()
	{
		return this.carburant;
	}
	
	public Object getPuissance()
	{
		return this.puissance;
	}
	
	public Object getNom()
	{
		return this.nom;
	}
	
	
	

}
