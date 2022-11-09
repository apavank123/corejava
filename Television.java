class Television{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOFF(){
		System.out.println("inside onOrOFF");
		if(isConnected==false){
			isConnected=true;
			System.out.println("Television is turned Onn...");
		}
		if(isConnected== true){
			isConnected=false;
			System.out.println("Television is turned OFF...");
		}
		System.out.println("end of onOrOFF");
	return isConnected;
	}	
}