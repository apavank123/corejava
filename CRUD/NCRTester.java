class NCRTester{
	
	public static void main(String pk[]){
		
		int num = 8;
		int r=3;
	
		
		int finalValue = NCR.fact(num);
		int ncr = NCR.fact(num)/NCR.fact(num-r)*NCR.fact(r);
		
		
		System.out.println("The Factorial of "+ num +" is "+ finalValue);
		System.out.println(ncr);
	}
}