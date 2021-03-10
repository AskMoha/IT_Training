package IT_TRAINING;

import java.util.ArrayList;

public class Session 
{
	private String type; 
	private double prix;
	private String date;
	private String ville;
	private String pays;
	private ArrayList<Client> clients; 
	private Formateur formateur; 
	
	public Session(String type, double prix, String date, String ville, String pays, ArrayList<Client> clients, Formateur formateur)
	{
		this.type = type; 
		this.prix = prix; 
		this.date = date; 
		this.ville = ville; 
		this.pays = pays; 
		this.formateur = formateur; 
		this.clients = clients; 
	}
	
	public String getType()
	{
		return this.type; 
	}
	
	//@Overide
	public String toString()
	{
		String str = new String("Type de la session: "+type+" Prix: "+prix+" Date: "+date+" Ville: "+ville+" Pays: "+pays+" Formateur: "+formateur.toString()+"Liste des inscrits:"); 
		for(Client i : clients)
		{
			str += i.getNom()+"\n"; 
		}
		return str; 
	}
	
	public boolean sessionMaintenue()
	{
		if(getType().equals("inter"))
		{
			if(clients.size()<4)//Nombre minimum de participants 
			{
				return false; 
			}
		}
		return true; 
	}
	
	public void enleverClient(String email)
	{
		for(Client i : clients)
		{
			if(i.getMail().equals(email))
			{
				clients.remove(i);
			}
		}
	}
	
	public void enleverFormateur()
	{
		formateur = null; 
		System.out.println("Le formateur ne dispense plus cette session"); 
	}
	
}
