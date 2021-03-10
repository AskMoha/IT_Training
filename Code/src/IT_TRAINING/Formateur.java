package IT_TRAINING;

import java.util.ArrayList;

public class Formateur 
{
	private String nom;
    private String prenom;
    private String telephone;
    private int nbAnneeExperience;
    private ArrayList <Evaluation> evals;
    
    public Formateur(String nom,String prenom,String telephone,int nbAnneeExperience,ArrayList <Evaluation> evals)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
        this.nbAnneeExperience=nbAnneeExperience;
        this.evals=evals;
    }
    
    public String toString()
    {
    	int s=0;
    	for(Evaluation i : evals)
    	{
    		if(i.getRecommandation()==true)
    		{
    			s++; 
    		}
    	}
        return "nom : "+ nom + " ,prenom : "+ prenom +" , numero de telephone : "+ telephone+ " ,nombre d'années d'experience : "+ nbAnneeExperience + ". Ce formateur a été recommandé "+s+" fois.";
    }
}
