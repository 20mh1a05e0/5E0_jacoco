package jacoco_project.E0_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class AppTest {
 
	 @Test
	    public void testSetImageForConditionOne() {
	        //write test to make conditionOne true
		 App p = new App();
		 assertEquals("10 is even number",true,p.isEvenNumber(10));
	    }

	    @Test
	    public void testSetImageForElseCondition() {
	        //write test to make conditionOne false
	    	App p = new App();
	    	assertEquals("10 is even number",true,p.isEvenNumber(10));
	    }
}