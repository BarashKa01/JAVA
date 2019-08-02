import java.util.ArrayList;
import java.util.List;



public class Main 
{

	public static void main(String[] args) 
	{
		List<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		listVoiture.add(new Voiture());
		
		List<Object> listVoitureSP = new ArrayList<Object>();
		listVoitureSP.add(new Object());
		listVoitureSP.add(new Object());
		
		
		Garage garage = new Garage();
		garage.add(listVoiture);
		System.out.println("----------------------------------");
		garage.add(listVoitureSP);
		
		
		
	}
	
	static void afficher(List<? super Voiture> list)
	{
		for (Object v : list)
		{
			System.out.println(v.getNom()+" est une voiture fonctionnant au "+v.getCarburant()+" d'une puissance de "+v.getPuissance());;
		}
	}

}
