class Capitale extends Ville
{
	private String monument;
	
	public Capitale()
	{
		super();
		monument = "aucun";
	}
	
	public Capitale (String nom, int hab, String pays, String monument) throws NHabitantsException, NomVilleException
	{
		super(nom,hab,pays);
		this.monument = monument;
	}
	
	public String decrisToi()
	{
		String str = super.decrisToi() + "\n \t ==>>" + this.monument+ " en est un monument";
		System.out.println("Invocation de super.decrisToi();");
		
		return str;
	}
	
	public String getMonument()
	{
		return monument;
	}
	
	public void setMonument()
	{
		this.monument = monument;
	}
	
	// UTILISATION DE LA COVARIANCE
	
	public String toString()
	{
		String str = super.decrisToi() + "\n \t ==>>" + this.monument+ " en est un monument";
		return str;
	}
}
