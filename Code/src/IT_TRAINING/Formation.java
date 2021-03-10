package IT_TRAINING;

import java.util.ArrayList;

public class Formation 
{
	private String nom;
    static private String domaine="Informatique";
    private String theme;
    private String sousTheme;
    private ArrayList <Test> tests;
    
    public Formation(String nom,String theme,String sousTheme,ArrayList<Test> tests)
    {
        this.nom=nom;
        this.theme=theme;
        this.sousTheme=sousTheme;
        this.tests=tests;
    }
    
    public String toString()
    {
        return "nom : "+nom+ " domaine : " + domaine +" theme : "+ theme + " sous theme : "+ sousTheme+" test:  "+ tests.toString();
    }
}
