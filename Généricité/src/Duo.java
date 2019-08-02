
public class Duo<T, S>
{
	private T valeur1;
	private S valeur2;
	
	//CONSTRUCTEUR SANS PARAMETRES
	public Duo()
	{
		this.valeur1 = null;
		this.valeur2 = null;
	}
	
	//CONSTRUCTEUR AVEC PARAMETRES
	public Duo(T val1, S val2)
	{
		this.valeur1 = val1;
		this.valeur2 = val2;
	}
	
	//METHODE D'INITIALISATION DES DEUX VALEURS
	public void setValeur(T val1, S val2)
	{
		this.valeur1 = val1;
		this.valeur2 = val2;
	}
	
	// GETTERS
	
	public T getValeur1()
	{
		return this.valeur1;
	}
	
	public S getValeur2()
	{
		return this.valeur2;
	}
	
	// SETTERS
	
	public void setValeur1(T val1)
	{
		this.valeur1 = val1;
	}
	
	public void setValeur2(S val2)
	{
		this.valeur2 = val2;
	}
	
}
