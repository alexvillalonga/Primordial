package exer;

import org.junit.Assert;
import org.junit.Test;

public class PrimordialTestNegatius {

	@Test (expected = IllegalArgumentException.class)
	public void test() {
		Primordial pr = new Primordial();
		Assert.assertEquals(2.0, pr.get_primordial(-2), 0.03);       
		Assert.assertEquals(6.0, pr.get_primordial(-3), 0.03);         
		Assert.assertEquals(6.0, pr.get_primordial(-4), 0.03);    
		Assert.assertEquals(30.0, pr.get_primordial(-5), 0.03);      
		Assert.assertEquals(210.0, pr.get_primordial(-7), 0.03);       
		Assert.assertEquals(2310.0, pr.get_primordial(-11), 0.03);
		Assert.assertEquals(30030.0, pr.get_primordial(-13), 0.03);
		Assert.assertEquals(510510.0, pr.get_primordial(-17), 0.03);
		Assert.assertEquals(9699690.0, pr.get_primordial(-19), 0.03); 
		Assert.assertEquals(223092870.0, pr.get_primordial(-23), 0.03);
	}


}