class FabonacciNu{
	/*Fibonacci series in Java. In fibonacci series, 
	next number is the sum of previous two numbers 
	for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
	*/
	public static void main(String pk[]){
		int n=15;
		int a=0;
		int b=1;
		int c=a+b;
		while(c<n){
			System.out.print(" "+c);
			c=a+b;
			a=b;
			b=c;
		}
	}
}