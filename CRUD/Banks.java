class Banks{
	
	static String banksNames[]={null, null, null, null, null};
	
	static int p;
	
	public static boolean addBanksNames(String banksName){
		
		System.out.println("Inside of addBanksNames");
		
		banksNames[p]=banksName;
		p++;
		System.out.println("End of inside addBanksNames");
		return false;
	}
	public static void getBanksNames(){
		for(int p=0; p<banksNames.length; p++){
			String ref = banksNames[p];
		System.out.println("Bank Name is " + ref);
		}
	}
}