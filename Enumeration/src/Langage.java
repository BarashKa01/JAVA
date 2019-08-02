
public enum Langage 
{
	JAVA("Langage JAVA", "Eclipse"),
	C("Langage C", "Code Blocks"),
	CPlus("Langage C++", "Visual Studio"),
	PHP("Langage PHP", "PS Pad");
	
	private String name ="";
	private String editor ="";
	
	// CONSTRUCTEUR
	
	Langage(String name, String editor)
	{
		this.name= name;
		this.editor = editor;
	}
	
	// GETTERS
	
	public void getEditor()
	{
		System.out.println("Editeur : " + editor);
	}
	// METHODE REDEFINIES
	
	public String toString()
	{
		return name;
	}
	
	

}
