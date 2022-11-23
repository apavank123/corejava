class NPRTester{
	
	public static void main(String pk[]){
		
		int num = 5;
		int r=3;
	
		
		int finalValue = NPR.fact(num);
		int npr = NPR.fact(num)/NPR.fact(num-r);
		
		
		System.out.println("The Factorial of "+ num +" is "+ finalValue);
		System.out.println(npr);
	}
}