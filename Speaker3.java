class Speaker3{
	
	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=9;
	static int currentVolume;
	
	public static  boolean onOrOff(){
		//System.out.println("inside onOrOff()");
		if(isConnected == false ){
			isConnected = true ;
			System.out.println("Speaker3 is turned Onn....");
		}
		else if(isConnected == true){
			isConnected =false;
			System.out.println("Speaker3 is Off");
		}
		
		System.out.println("end of onOroff()");
	return isConnected ;
	}
	
	public static void increaseVolume(){
		//System.out.println("inside increaseVolume()");
		//false==true
		if (isConnected == true){
		if(currentVolume < maxVolume){
			currentVolume = currentVolume+ 1;
		System.out.println("the currentVolume is : " + currentVolume);
		}
		else{
			System.out.println("maxVolume....\n");
		}
		}
		else{
			System.out.println("maxVolume reached....\n");
		}
		}
		
	static int minVolume;
	static int maxVolume ;
	static int currentVolume=7;
		public static void decreaseVolume(){
		//System.out.println("inside decreaseVolume()");
		if (isConnected == true){
		if(minVolume < currentVolume){
			currentVolume = currentVolume -1;
		System.out.println("the currentVolume is : " + currentVolume);
		}
		else{
			System.out.println("minVolume....\n");
		}
		}
		else{
		System.out.println("minVolume reached....\n");
	}
}
}