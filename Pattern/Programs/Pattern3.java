class Pattern3{
	public static void main(String pk[]){
		int n=9;
		for(int row=1; row<=n; row++){
			for(int col=1; col<=n; col++){
				if(row == 2 && col == 2){
					System.out.print("@");
				}
				else{
					System.out.print(col);
				}
				System.out.print("");
			}
			System.out.println("");
		}
		
	}

}