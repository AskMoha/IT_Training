package IT_TRAINING;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEvaluation 
{
	Evaluation eval = null; 
	
	@BeforeEach
	void setUp() throws Exception 
	{
		eval = new Evaluation(4, 3, 2, true); 
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		eval = null; 
		assertNull(eval); 
	}

	@Test
	void testEvaluation() 
	{ 
		Evaluation eval2 = new Evaluation(2, 1, 3, false); 
		assertEquals(2, eval2.getNoteAccueil()); 
		assertEquals(1, eval2.getNoteEnviro()); 
		assertEquals(3, eval2.getNoteStage()); 
		assertFalse(eval2.getRecommandation()); 
	} 

	@Test
	void testSetNoteAccueil() 
	{
		eval.setNoteAccueil(5); 
		assertEquals(5, eval.getNoteAccueil());
	}

	@Test
	void testSetNoteEnviro() 
	{
		eval.setNoteEnviro(4); 
		assertEquals(4, eval.getNoteEnviro());
	}

	@Test
	void testSetNoteStage() 
	{
		eval.setNoteStage(3); 
		assertEquals(3, eval.getNoteStage());
	}
	
	@Test
	void testSetRecommandation() 
	{
		//fail("Not yet implemented");
		eval.setRecommandation(false); 
		assertFalse(eval.getRecommandation()); 
	}

	@Test
	void testGetNoteAccueil() 
	{
		//fail("Not yet implemented");
		int note = 4; 
		assertEquals(note, eval.getNoteAccueil()); 
	}

	@Test
	void testGetNoteEnviro() 
	{
		//fail("Not yet implemented");
		int note = 3; 
		assertEquals(note, eval.getNoteEnviro()); 
	}

	@Test
	void testGetNoteStage() 
	{
		//fail("Not yet implemented");
		int note = 2; 
		assertEquals(note, eval.getNoteStage()); 
	}

	@Test
	void testGetRecommandation() //boolean 
	{
		//fail("Not yet implemented");
		assertTrue(eval.getRecommandation()); 
	}

	@Test
	void testAlerte() 
	{
		//fail("Not yet implemented");
		assertFalse(eval.alerte()); 
	}
}
