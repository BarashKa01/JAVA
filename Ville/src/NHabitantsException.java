class NHabitantsException extends Exception

{
	public NHabitantsException()
	{
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants n�gatif !");
	}
	
	public NHabitantsException (int nbre)
	{
		System.out.println("Instanciation avec un nombre d'habitants n�gatif");
		System.out.println("\t => "+ nbre);
	}
}
