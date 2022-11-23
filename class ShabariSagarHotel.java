class ShabariSagarHotel
{
  public static void main(String pk[]){
  String address ="Mudhol";
  String[] waiterName={"Vivek", "Raju", "Maruti", "Rohit", "Shivu", "Manju", "Sadanand", "Sanket", "Pradeep"};
  int noOfWaiters=9;
  String areaName[]={"Shivaji Circle", "BusStand Opposite", "Old Court", "Ranna Circle"};
  int noOfAreas=4;
  String foodMenu[]={"Veg Kolhapuri", "Kazu Kolhapuri", "South Thali", "Nort Thali", "Veg Hydrabadi"};
  
  System.out.println("Welcome to ShabariSagarHotel");
  
  System.out.println("List Of Managers");
   for (int z=0; z<managerName.length; z++){
	   System.out.println(managerName[z] + "");
   }
   System.out.println("List of coPartner");
   for(int x=0; x<coPartner.length; x++){
	   System.out.println(coPartner[x]+ "");
   }
   System.out.println("List of foodMenu");
   for(int c=0; c<foodMenu.length; c++){
	   System.out.println(foodMenu [c]+ "");
   }
}
}