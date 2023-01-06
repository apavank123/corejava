class Pattern1{
	
	public static void main(String pk[]){
		// || ==> means OR gate 
		// && ==> means AND gate
		int n= 5;
		for (int i=0; i <n; i++){
			for (int j = 0; j<n; j++){
				if (i==0&&j==0 || i==1 && j==1){
					System.out.print("PK");
				}
				else{
					System.out.print(j);
				}

			}
			System.out.println();
		}
	}

}