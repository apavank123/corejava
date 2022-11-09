class EmpireHotel
{
  public static void main(String pk [])
  {
   String address="Shivaji Circle Mudhol";
   String [] managerName={"Vivek", "Vinayak", "Rohit", "Raju", "Ganesh", "Ganga", "Akshata", "Pooja"};
   int noOfManagers = 8;
   String coPartner[]={"Prashant", "Vinay", "Param", "Basu"};
   int noOfcoPartner=4;
   String foodMenu[]={"Chilli Kebab", "Grilled Chicken", "Chilli Chicken Dry", "Pepper Chicken Dry", "Mutton Raan", "Mutton Pepper Dry", "Chicken Tikka"};
   
   System.out.println("Welcome to EmpireHotel");
   
   System.out.println("List Of Managers");
   for (int z=0; z<managerName.length; z++){
	   System.out.println(managerName[z] + "");
   }
   
    System.out.println("List Of coPartner");
   for (int z=0; z<coPartner.length; z++){
	   System.out.println(coPartner[z] + "");
   }
   
   System.out.println("List Of foodMenu");
   for (int z=0; z<foodMenu.length; z++){
	   System.out.println(foodMenu[z] + "");
   }

}
}