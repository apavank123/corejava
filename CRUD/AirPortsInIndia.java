class AirPortsInIndia{
	
	static String airPortsNames[]={null,null,null,null,null};
	
	static int i;
	
	public static boolean addAirPortNames(String airPortsName){
		
		System.out.println("Inside of addAirPortNames");
		
		airPortsNames[i]=airPortsName;
		i++;
		
		System.out.println("End of the addAirPortNames");
		return false;
	}
	
	public static void getAirPortName(){
		
		for (int i=0; i<airPortsNames.length; i++){
			
		String ref = airPortsNames[i];
		System.out.println("AirPortName is " + ref);
		}
	}

}