package IT_TRAINING;

public class Salle 
{
	private int numero;
    private String domaine;
    private String theme;
    private String sousTheme;
    private boolean reserv�e;
    
    public Salle(int numero, String domaine, String theme,String sousTheme)
    {
        this.numero=numero;
        this.domaine=domaine;
        this.theme=theme;
        this.sousTheme=sousTheme;
        reserv�e=false;
    }
    
    public void setReservee(boolean reserv�e)
    {
        this.reserv�e=reserv�e;
    }
    
    public boolean getReservee()
    {
        return this.reserv�e;
    }
    
    public int getNumSalle()
    {
    	return this.numero; 
    }
}
