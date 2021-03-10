package IT_TRAINING;

import java.util.ArrayList;

public class ServiceCommercial 
{
	private int nbClient;
	private int nbFormation; 
	private int CA; 
	private ArrayList<Client> clients; 
	
	public ServiceCommercial(int nbClient, int nbFormation, int CA, ArrayList<Client> clients)
	{
		this.nbClient= nbClient; 
		this.nbFormation =nbFormation; 
		this.CA= CA; 
		this.clients = clients; 
	}
	
	public String contacterClient(String message)
	{
		String str = new String("Vous avez contacté un client: "+message); 
		return str; 
	}
}

