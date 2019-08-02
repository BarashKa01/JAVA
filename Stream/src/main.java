import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;



public class main 
{

	public static void main(String[] args) 
	{
		// Nous d�clarons nos objets en dehors du bloc try/catch
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try 
		{
			// On instancie nos objets
			// fis va lire le fichier
			// Le fos va �crire dans le nouveau fichier
		
			fis = new FileInputStream(new File("test.txt"));
			fos = new FileOutputStream(new File("test2.txt"));
			bis = new BufferedInputStream(new FileInputStream(new File("test2.txt")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("Test3.txt")));
			
			//On cr�e un tableau de byte pour indiquer le nombre de bytes lus �
			//chaque tour de boucle.
			
			byte[] buf = new byte[8];
			
			// On cr�e une variable de type int pour y affecter le r�sultat de la lecture
			//Vaut -1 quand c'est fini
			
			long startTime = System.currentTimeMillis();
			
			
			// Tant que l'affectation dans la variable est possible, on boucle.
			//Lorsque la lecture du fichier est termin�e l'affectation n'est plus possible !
			//On sort donc de la boucle
			
			while (fis.read(buf) != -1)
			{
				fos.write(buf);
			}
					
						System.out.println("Temps de lecture et �criture avec FileInputStream et FileOutputStream : " +(System.currentTimeMillis() - startTime));
						
			startTime = System.currentTimeMillis();
			
			while (bis.read(buf) != -1)
			{
				bos.write(buf);
			}
			
				System.out.println("Temps de lecture et �criture avec BufferedInputStream et BufferedOutputStream : "+(System.currentTimeMillis() - startTime));
			
			fis.close();
			fos.close();
			bis.close();
			bos.close();

		}
			
		catch (FileNotFoundException e) // Cette exception est lev�e si l'objet FileInputStream ne trouve aucun fichier
		{
			e.printStackTrace();
		}
		catch (IOException e) // Celle-ci se produit lors d'une erreur d'�criture ou de lecture
		{
			e.printStackTrace();
		}
		
	}

}
