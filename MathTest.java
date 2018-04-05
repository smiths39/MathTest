import junit.framework.TestCase;

public class MathTest extends TestCase {
	private static int value1 =0;
	private static int value2 = 0;
	static Calculation calc = new Calculation();

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public static void testAdd(int val1, int val2) {
		int total = val1 + val2;
		int sum = calc.add(val1, val2);
		
		assertEquals(sum, total);
	}

	public static void testFailedAdd(int val1, int val2) {
		int total = val1 + val2 + 1;
		int sum = calc.add(val1, val2);

		assertNotSame(sum, total);
	}

	public static void testSub(int val1, int val2) {
		int total = val1 - val2;
		int sub = calc.sub(val1, val2);
		
		assertEquals(sub, total);
	}

	public static void main(String [] args) {
		testAdd(5,3);
		testSub(5,3);
		testFailedAdd(5,3);
	}
}