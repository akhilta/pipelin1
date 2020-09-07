package javalclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		class1 c=new class1();
		assertEquals(5, c.add(1, 4));
	}

}
