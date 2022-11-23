class ShabariSagarHotel
{
  public static void main(String pk1[]){
  String address ="Mudhol";
  String[] waiterName={"Vivek", "Raju", "Maruti", "Rohit", "Shivu", "Manju", "Sadanand", "Sanket", "Pradeep"};
  int noOfWaiters=9;
  String areaName[]={"Shivaji Circle", "BusStand Opposite", "Old Court", "Ranna Circle"};
  int noOfAreas=4;
  String foodMenu[]={"Veg Kolhapuri", "Kazu Kolhapuri", "South Thali", "Nort Thali", "Veg Hydrabadi"};
  
  System.out.println("Welcome to ShabariSagarHotel");
  
  System.out.println("List Of waiterName");
   for (int z=0; z < waiterName.length; z++){
	   System.out.println(waiterName[z] + "");
   }
   System.out.println("List of areaName");
   for(int x=0; x<areaName.length; x++){
	   System.out.println(areaName[x]+ "");
   }
   System.out.println("List of foodMenu");
   for(int c=0; c<foodMenu.length; c++){
	   System.out.println(foodMenu [c]+ "");
   }
}
}