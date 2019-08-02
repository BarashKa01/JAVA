class NHabitantsException extends Exception

{
	public NHabitantsException()
	{
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
	}
	
	public NHabitantsException (int nbre)
	{
		System.out.println("Instanciation avec un nombre d'habitants négatif");
		System.out.println("\t => "+ nbre);
	}
}
