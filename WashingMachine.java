class WashingMachine{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOFF(){
		System.out.println("inside onOrOFF");
		if(isConnected == false){
			isConnected = true;
			System.out.println("WashingMachine turned Onn....");
		}
		if(isConnected == true){
			isConnected = false;
			System.out.println("WashingMachine turned OFF....");
		}
		System.out.println("Ended of onOrOFF");
		return isConnected;
	}
}