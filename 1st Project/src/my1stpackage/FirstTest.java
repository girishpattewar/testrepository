package my1stpackage;

public class FirstTest {
	
	

	public FirstTest(String applicationName, String applicationURl) {
		super();
		this.applicationName = applicationName;
		this.applicationURl = applicationURl;
	}



	public static void main(String[] args) {
		String applicationSupportedBrowser = "Chrome";
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		int d = add(10,5);
		System.out.println("adding 10 and 5 = "+d);
		
		int e = Math.addExact(10, 5);
		
		System.out.println("additon by Math library/jar = "+e);

	}
	
	public void someMethod() {
		applicationName = "RSTP";
		System.out.println("testing now application "+applicationName);
	}
	
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	
	
	String applicationName;
	String applicationURl;
	

}
