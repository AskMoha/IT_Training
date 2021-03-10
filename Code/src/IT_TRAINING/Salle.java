package IT_TRAINING;

public class Salle 
{
	private int numero;
    private String domaine;
    private String theme;
    private String sousTheme;
    private boolean reservée;
    
    public Salle(int numero, String domaine, String theme,String sousTheme)
    {
        this.numero=numero;
        this.domaine=domaine;
        this.theme=theme;
        this.sousTheme=sousTheme;
        reservée=false;
    }
    
    public void setReservee(boolean reservée)
    {
        this.reservée=reservée;
    }
    
    public boolean getReservee()
    {
        return this.reservée;
    }
    
    public int getNumSalle()
    {
    	return this.numero; 
    }
}
