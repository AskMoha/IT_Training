package IT_TRAINING;

import java.util.ArrayList;

public class Logistique 
{
	private ArrayList<Formation> formation;
    private ArrayList<Salle> salle;
    
    public Logistique(ArrayList <Formation> formation, ArrayList <Salle> salle)
    {
        this.formation=formation;
        this.salle=salle;
    }
    
    public void ReserverSalle(int numero) 
    {
        for(Salle s: this.salle)
        {
            if(s.getNumSalle()==numero)
            {
                s.setReservee(true);
                break;
            }
        }
    }       

}
