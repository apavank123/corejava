class Factorial{
	/*Factorial of n is the product of all positive descending integers. 
	Factorial of n is denoted by n!. For example: ... Here, 4! is ...
	*/
	public static int fact(int n){
		//n =7
		int factorialValue=1;
		//factorialValue = 1
		for(int f =1 ; f<=n; f++){
			
			factorialValue = factorialValue*f;
			// 6 =   6*4 ;
		}
		return factorialValue;
	}
	public static void main(String pk[]){
		
		int num = 9;
		
		int finalValue = Factorial.fact(num);
		
		System.out.println("The Factorial of "+ num +" is "+ finalValue);
	}
}