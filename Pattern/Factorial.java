class Factorial{
	public static void main(String pk[])
	{
	int n, fact =1;
	n=5;
	//scanner sc=new scanner(System.in);
	
	System.out.print("Number is " +n + "\n");
	//n=sc.nxtlnt();
	for(int i=1; i<=n; i++){
		fact=fact*i;
	}
	System.out.print("Factorial of given number is " +fact);
	}	
}