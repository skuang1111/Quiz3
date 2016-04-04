import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	Triangle t1 = new Triangle(2.0, 3.0, 4.0);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea() {
		
		double s = (2.0 + 3.0 + 4.0) / 2;
		double expectedArea = Math.sqrt(s * (s - 2.0) * (s - 3.0) * (s - 4.0)); 
		double actualArea = t1.getArea();
		assertEquals(expectedArea, actualArea, 0.01);
	}

	@Test
	public void testGetPerimeter() {
		double expectedPerimeter = 2.0 + 3.0 + 4.0;
		double actualPerimeter = t1.getPerimeter();
		assertEquals(expectedPerimeter, actualPerimeter, 0.01);
	}

}
