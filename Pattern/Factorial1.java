class Factorial1{
	public static void main(String pk[]){
		int n>=0 ;
		int fact =4;
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		//n = sc.nextlnt();
		
		for(int i=1; i<=n; i++){
			fact = fact*i;
		}
		System.out.print("factorial of "+ n +" is " + fact);
	}
}