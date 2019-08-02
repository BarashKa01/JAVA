import java.util.Objects;

public class Ville
{
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;
	
	
	
	public Ville()
	{
		System.out.println("Création d'une ville sans attributs !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		nbreInstances++;
		nbreInstancesBis++;
		this.setCategorie();
	}
	
	public Ville(String pNom, int pNbre, String pPays)
	throws NHabitantsException, NomVilleException
	{
		System.out.println("Création d'une ville avec des attributs !");
		
		if (pNbre < 0)
		{
			throw new NHabitantsException(pNbre);
		}
		else if (pNom.length() < 3)
		{
			throw new NomVilleException("Le nom de la ville doit faire au moins 3 caractères");
		}
		else
		{
			nomVille = pNom;
			nomPays = pPays;
			nbreHabitants = pNbre;
			nbreInstances++;
			nbreInstancesBis++;
			this.setCategorie();
		}

	}
	
	//ACCESSEURS
	
	public String getNom()
	{
		return nomVille;
	}
	public int getNombreHabitants()
	{
		return nbreHabitants;
	}
	public String getNomPays()
	{
		return nomPays;
	}
	public static int getNbreInstancesBis()
	{
		return nbreInstancesBis;
	}
	
	// MUTATEURS
	
	public void setNom(String pNom)
	{
		nomVille = pNom;
	}
	public void setNomPays(String pPays)
	{
		nomPays = pPays;
	}
	public void setNombreHabitants(int nbre)
	{
		nbreHabitants = nbre;
		this.setCategorie();
	}
	
	// METHODES D'INSTANCE
	
	protected void setCategorie()
	{
		int bornesSuperieures[] = {0, 1000, 10000, 50000, 100000, 500000, 1000000};
		char categories[] = {'?', 'A', 'b', 'C', 'd', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
		{
			i++;
			this.categorie = categories[i];
		}
	}
	
	// REDEFINITION DE LA METHODE DE HASHAGE D'OBJECT
	
	public int hashCode()
	{
		return Objects.hash(categorie, nbreHabitants, nomPays, nomVille);
	}
	
	// REDEFINITION DE LA METHODE EQUALS
	
	public boolean equals(Object a, Object b)
	{
		return Objects.equals(a, b);
	}
	// RETOURNE LA DESCRIPTION DE LA VILLE
	
	public String decrisToi()
	{
		return "\t"+this.nomVille+" ville de "+this.nbreHabitants+" habitants se situant en "+this.nomPays+" celle-ci est de catégorie "+this.categorie;
	}
	
	// RETOURNE UNE PHRASE DE COMPARAISON
	
	public String comparerVille(Ville v1)
	{
		String str = new String();
		
		if (v1.getNombreHabitants() > this.nbreHabitants)
		{
			str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
		}
		else
		{
			str = this.getNom()+" est une ville plus peuplée que "+v1.getNom();
		}
		return str;
	}
	
	// UTILISATION DE LA COVARIANCE
	
	public String toString()
	{
		return "\t"+this.nomVille+" ville de "+this.nbreHabitants+" habitants se situant en "+this.nomPays+" celle-ci est de catégorie "+this.categorie;
	}
}