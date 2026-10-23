class OperatorsCombination 
{
	public static void main(String arg[])
	{
		int a = 10;
		int b = 3;
		int c = 5;
		
		a = b++ + c++ ;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		c = b = a;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		b = a-- + --b - c++;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
	}
}