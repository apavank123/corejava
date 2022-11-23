class Beaches{
	// static String beachNames[]={"Marina", "null", "null", "null", "null"};
	
	
	static String beachNames[]={null, null, null, null, null};
	
	static int index;
	
	//saveBeach, storebeachNames
	//beachName = "Marina"
	
	public static boolean addBeachNames(String beachName){
			System.out.println("inside of addBeachNames");
		//beachName[0] ="Marina"
		// beachName[1]="Malpe"
		//beachName[2]= "OM"
		//beachName[3]= "Malvan"
		//beachName [4]= "Bhaga"
		
		beachNames[index]= beachName;
		index++;
		
		/*if(beachNames.length<=5){
		
		beachNames[index]= beachName;
		index++;
		
		return true;
		}
		else
		{
			System.out.println("Beach Names Overloaded can't add more data");
		}*/
		System.out.println("End of addBeachNames");
		return false;
	}
	//Read operation 
	public static void getBeachNames(){
	
	for(int index=0; index < beachNames.length; index++){
		String ref= beachNames[index];
		System.out.println("Beach Name is "+ ref);
	}
	}
}