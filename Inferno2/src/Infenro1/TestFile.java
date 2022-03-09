package Infenro1;

import static org.junit.Assert.*;

import javax.swing.tree.ExpandVetoException;

import org.junit.Test;

public class TestFile {

	@Test

	public void test2() throws Exception{
		Inferno x = new Inferno(false,"Anger");
		SinDemon y = new SinDemon("Y", 10, "Fraud","Anger",x);
		y.releaseDemon(x);
		if(x.getHP()<=80){
			throw new Exception ("The Methid has something wrong");
		}
	}

}
