class UserVariable{

 static boolean isalive ;
 static long contactno ;
 static double price ;

 
 public static void main (String pk[]){
 
 isalive = true;
 long contactno = 9986129465l;
 price = 0.98;
 
 
 System.out.println("main Started   ");
 System.out.println(" boolean isalive" + isalive);
 System.out.println("contactno"+contactno );
 System.out.println(" price"+price );
 System.out.println("main Ended");
 

 isalive = false;
 long contactNo = 9986129465l;
 price = 0.98;
 
     }
 }