class Beaches1{

       static String beachNames[] = {null, null, null, null, null};
	   
	   static int index ;
	   
	   public static boolean addBeachNames(String beachName){
		   
		   System.out.println("inside addBeachNames");
		   
		     //beachNames[0] = Marina";
			 //beachNames[1] = "Malpe";
			 
			 if(beachNames.length <= 5){
			 
		     beachNames[index] = beachName;
		       
			   index ++;
			   
			   return true;
			 }
			 
			 else{
				 
				System.out.println("beaches names length is exceed");
		    
			   System.out.println("end addBeachNames");
			   
			   return false;
			 
			 
			 }
	   }
	   
        //Read operation
	   
       public static void getBeachNames(){
		
	   for(int index = 0; index < beachNames.length; index++){
		
		  String ref = beachNames[index];
			
		    System.out.println("Beach name is " + ref);
		
		}
		
		
	}

}