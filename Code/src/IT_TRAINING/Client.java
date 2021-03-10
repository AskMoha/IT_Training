package IT_TRAINING;
import java.util.ArrayList; 

public class Client 
{
	private String nom; 
	private String prenom;
	private String telephone;
	private String mail;
	private ArrayList<Session> sessions; 
	private ArrayList<Evaluation> evals; 
	private ArrayList<Test> tests; 
	private ServiceCommercial serv; 
	
	public Client(String nom, String prenom, String telephone, String mail, ArrayList<Session> sessions, ArrayList<Evaluation> evals, ArrayList<Test> tests, ServiceCommercial serv)
	{
		this.nom = nom; 
		this.prenom = prenom; 
		this.telephone = telephone; 
		this.mail = mail; 
		this.sessions = sessions; 
		this.evals = evals; 
		this.tests = tests; 
		this.serv = serv; 
	}
	
	public String getMail()
	{
		return this.mail; 
	}
	
	public String getNom()
	{
		return this.nom; 
	}
	
	public void evaluer(int note1, int note2, int note3)
	{
		for(Evaluation i : evals)
		{
			i.setNoteAccueil(note1);
			i.setNoteEnviro(note2);
			i.setNoteStage(note3);
		}
	}
	
	public String consulterFormation(Formation form)
	{
		return form.toString(); 
	}
	
	public void consulterSession()
	{
		for(Session i : sessions)
		{
			i.toString(); 
		}
	}
	
	public String contacterServiceCom(String message)
	{
		String str = new String("Vous avez écrit au service commercial : "+message); 
		return str; 
	}
}
