package IT_TRAINING;

public class Evaluation 
{
	private int noteAccueil; 
	private int noteEnvironnement; 
	private int noteStage; 
	private boolean recommandation; 
	
	public Evaluation(int noteAccueil, int noteEnvironnement, int noteStage, boolean recommandation)
	{
		this.noteAccueil = noteAccueil; 
		this.noteEnvironnement = noteEnvironnement; 
		this.noteStage = noteStage; 
		this.recommandation = recommandation; 
	}
	
	public void setNoteAccueil(int note)
	{
		noteAccueil = note; 
	}
	
	public void setNoteEnviro(int note)
	{
		noteEnvironnement = note; 
	}
	
	public void setNoteStage(int note)
	{
		noteStage = note; 
	}
	
	public void setRecommandation(boolean recommandation)
	{
		this.recommandation=recommandation; 
	}
	
	public int getNoteAccueil()
	{
		return this.noteAccueil; 
	}
	
	public int getNoteEnviro()
	{
		return this.noteEnvironnement; 
	}
	
	public int getNoteStage()
	{
		return this.noteStage; 
	}
	
	public boolean getRecommandation()
	{
		return this.recommandation; 
	}
	
	public boolean alerte()
	{
		if(getNoteAccueil()<3 || getNoteEnviro()<3 || getNoteStage()<3)
		{
			System.out.println("Note inférieure à 3 !"); 
			return false; 
		}
		return true; 
	}	

}
