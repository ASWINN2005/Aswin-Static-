

public class Statictest {
	static int a,b,c;		// Static variables
	int d,e,f;				// Instance variables
	
	static {
		a=1;b=2;c=3;				
	}
	{
		a=11;b=22;c=33;
		d=111;e=222;f=333;
		
	}
	static void display() {
		System.out.println("-----------From Static display (only static ) -----------");
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
		void display1() {
		System.out.println("-----------From normal display (both static and instance) -----------");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
		public static void main(String[] args) {
				
			
			Statictest s=new Statictest();
			
			System.out.println(s.a);
			System.out.println(s.b);
			System.out.println(s.c);
			System.out.println(s.d);
			System.out.println(s.e);
			System.out.println(s.f);
			
				
			
		}
	
	
}
	

