package IT_TRAINING;

public class Responsable 
{
	private String type;
    private Formation formation;
    
    public Responsable(String type,Formation formation)
    {
        this.type=type;
        this.formation=formation;
    }
    
    public void validerFormation ()
    {
        Formation perso = formation;
    }
}
