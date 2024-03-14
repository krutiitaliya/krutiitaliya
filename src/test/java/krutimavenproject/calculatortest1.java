package krutimavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class calculatortest1 {
@Test
public void testadd () {
	assertEquals(7,calculator1.add(5,2));
	assertEquals(-5,calculator1.add(-7,2));
}
@Test
public void testsubstarct () {
	assertEquals(5,calculator1.substract(7,2));
	assertEquals(-2,calculator1.substract(-4,-2));
	}
@Test
public void testmultiply () {
	assertEquals(15,calculator1.multiply(5,3));
	assertEquals(-6,calculator1.multiply(2,-3));
	}
@Test
public void testdivide() {
	assertEquals(2,calculator1.divide(10,5));
	assertEquals(-3,calculator1.divide(-9,3));
	
	}
}
