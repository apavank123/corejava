class AC{
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	
	public static boolean onOrOFF(){
		System.out.println("inside onOrOFF");
		if(isConnected == false){
			isConnected = true;
			System.out.println("AC turned Onn...");
		}
		if(isConnected == true){
			isConnected = false;
			System.out.println("AC turned OFF...");
		}
		System.out.println("ended of onOrOFF");
		return isConnected;
	}
	
	public static void main(String pk[]){
		System.out.println("main method started");
		
		AC.brand = "Samsung";
		AC.color = "White";
		AC.price = 30000;
		AC.onOrOFF();
		
		System.out.println("main method ended");
	}
}