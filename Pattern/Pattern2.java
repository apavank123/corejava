class Pattern2{
	
	public static void main(String pk []){
		int n = 6;
		for (int row = 0; row < n; row++){
			for (int col=0; col < n; col++)
			{
				if(row ==0 && col== 0 || row==0 &&col == 1){
					System.out.print("#");
				}else{
					System.out.println("#");
				}
			}
			System.out.println();
		}
	}

}