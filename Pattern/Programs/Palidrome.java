class Palidrome{
	/* A palindrome number is a number that is same after reverse. 
	For example 545, 151, 34543, 343, 171, 48984 are the palindrome*/
	public static void main(String pk[]){
		
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp = num ;
		while (num > 0){
			int rem = num %10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		if(temp == rev ){
			System.out.println("Number is Palidrome ");
		}else{
			System.out.println("Number is not Palidrome");
		}
		sc.close();
	}
}