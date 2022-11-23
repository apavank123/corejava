class SuperMarket{

 static String superMarketName="Relience Mart";
 
 // static String vegitables[];
 // static String perfumes[];
 
   public static void main(String pk[]){
 
 System.out.println("Welcome to"+ superMarketName);
 
  String vegitables[]= {"Lady's Finger","Onion", "Tomato", "Cauliflower"};
   
  String perfumes[] = {"Fogg", "Layer Shot", "Axe", "Denver"};
	
       System.out.println("List of vegitables Selection");
       System.out.println( vegitables[0] +" "+
                            vegitables[1] +" "+ 
                           vegitables[2] +" "+
                            vegitables[3]);
  System.out.println("List of Perfumes Selection");
       System.out.println( perfumes[0] +" "+
                            perfumes[1] +" "+ 
                            perfumes[2] +" "+
                            perfumes[3]);

  }
}