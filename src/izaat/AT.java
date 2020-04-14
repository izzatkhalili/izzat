package izaat;

import static org.junit.Assert.*;

import org.junit.Test;

public class AT {

	@Test
	public void test() {
		A d=new A();
		int result=d.adds1(3, 5);
		
		assertEquals(8,result);
	}

}
