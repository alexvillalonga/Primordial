package exer;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (value=Parameterized.class)
public class PrimordialTest {
	private double res;
	private double valor;
	private double delta;
	
	
	@Parameters
	public static Collection<Double[]> testParam() {
		Primordial pr = new Primordial();
		return Arrays.asList(new Double[][]{
				{2.0, pr.get_primordial(2), 0.03},         
				{6.0, pr.get_primordial(3), 0.03},         
				{6.0, pr.get_primordial(4), 0.03},         
				{30.0, pr.get_primordial(5), 0.03},        
				{210.0, pr.get_primordial(7), 0.03},       
				{2310.0, pr.get_primordial(11), 0.03},     
				{30030.0, pr.get_primordial(13), 0.03},    
				{510510.0, pr.get_primordial(17), 0.03},   
				{9699690.0, pr.get_primordial(19), 0.03},  
				{223092870.0, pr.get_primordial(23), 0.03},
		});
	}
	
	public PrimordialTest(double res, double valor, double delta) {
		this.res = res;
		this.valor = valor;
		this.delta = delta;
	}
	
	@Test
	public void test() {
		Assert.assertEquals(res, valor, delta);
	}
	
}