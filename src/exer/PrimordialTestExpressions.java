package exer;

import org.junit.Assert;
import org.junit.Test;

public class PrimordialTestExpressions {

	@Test
	public void test() {
		Primordial pr = new Primordial();
		Assert.assertTrue(pr.get_primordial(8) > 200);
		Assert.assertFalse(pr.get_primordial(6) > 30);
		Assert.assertTrue(pr.get_primordial(2) <= 2);
	}

}
