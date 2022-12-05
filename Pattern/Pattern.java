class Pattern{
	
	public static void main(String pk [])
	{
		int n= 5;
		for (int i=0; i <n; i++){
			for (int j = 0; j<n; j++){
			if ( i==1 &&j==0 || i==2 && j==0 || i== 3 && j==0 || i==0&&j==0 || i==4&&j==0 || i==5&&j==0 
			|| i==0 &&j==1 || i==0 &&j==2 || i==0 &&j==3 || i==0 && j==4
		
			|| i==1 && j==4 || i==2 && j==1|| i==2 && j==2 || i==2 && j== 3 || i==2 && j==4	){
					System.out.print("@");
				}
				else{
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println("______________");
	}

}