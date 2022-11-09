class VivantaTajHotel
{
  public static void main(String pk[])
  {
	String address = "";
	String [] managerNames={"Raju", "Laxmi", "Deepak", "Akshata", "Vinayak"};
	int noOfManagers=5;
    String foodMenu[]={"Fish Fry", "Chiken Handi", "Chiken Hydrabadi", "Chiken Kolhapuri", "Chiken Biryani", "Chiken Fry", "Mutton Biryani", "Dum Biryani", "Chiken lollypop", "Bonless Chiken" } ;
   
	System.out.println("Welcome to VivantaTajHotel" );
  
    System.out.println("List of Managers" );
    for(int z=0; z<managerNames.length; z++){
    System.out.println(managerNames[z]+ " ");
	 }
	System.out.println("Have the foodMenu");
    for(int zz=0; zz< foodMenu.length; zz++){
    System.out.println(foodMenu[zz]+ " ");
     }
  }
}
  
