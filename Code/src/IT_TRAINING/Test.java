package IT_TRAINING;

public class Test 
{
	int note; 
	
	public Test(int note)
	{
		this.note = note; 
	}
	
	public String toString()
	{
		String str = new String("Vous avez obtenu la note de "+note+" au test."); 
		return str;
	}
}
