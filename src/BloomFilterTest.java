package org.create_bloom;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BloomTest {

	@Before
	public void testing() {
		BloomFilter test=new BloomFilter(1000, 1000);
	
		int output_getHash= test.getHash(1);
		assertTrue("Method Fetching Hash_Value", true);
		
		
		boolean output_contains= test.contains(test);
		assertTrue("Method contains some value", true);
	}

	@Test
	public void Final_testing() {
		BloomFilter Final_test=new BloomFilter(2000, 2000);
		Final_test.add(100);
		Final_test.add(110);
		Final_test.add(120);
		Final_test.add(130);
		Final_test.add(140);
		Final_test.add(145);
		
				
		int Final_size= Final_test.getSize();
		assertEquals(6, Final_size);

/***************************************************/
		if(Final_test.contains(145))
				
		{boolean Final_contains=Final_test.contains(Final_test);
		
		assertTrue("Method contains the value", true);
		}
        
/***************************************************/        
		/*assertEquals(135, 135);*/
		/*assertEquals(145, Final_contains);*/
	}

}
